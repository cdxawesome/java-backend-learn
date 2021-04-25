package com.rico;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rico.domain.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class EsApiApplicationTests {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    void contextLoads() throws IOException {
        // 这个是springboot官方文档推荐的写法，方法已经过期了。
        IndexRequest request = new IndexRequest("spring-data", "elasticsearch", "1")
                .source("feature", "high-level-rest-client")
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);

        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.toString());
        restHighLevelClient.close();
    }

    @Test
    void myTest() throws IOException {
        // 创建时可以直接就这么写，来设置request的参数(这里也是springboot官方文档的写法)
        IndexRequest request = new IndexRequest("spring-data3")
                .id("1")
                .opType(DocWriteRequest.OpType.CREATE)
                .source("name", "rico2")
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.toString());
        restHighLevelClient.close();
    }

    @Test
    void myTest2() throws IOException {
        // 创建一个user对象
        User user = new User();
        user.setName("dylan2");
        user.setAge(27);
        user.setBirthday(new Date());

        // 将user对象转成json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String userStr = objectMapper.writeValueAsString(user);

        // 创建索引，并且设置document参数，将json字符串作为数据存入
        IndexRequest request = new IndexRequest("users")
                .id("2")
                .opType(DocWriteRequest.OpType.CREATE)
                .source(userStr, XContentType.JSON)
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);

        // 发送请求，获取响应的结果
        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.toString());

        // 释放资源
        restHighLevelClient.close();
    }

    // 删除索引
    @Test
    void myTest3() throws IOException {
        // 创建删除index的request
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("spring-data3");
        // 判断index是否存在
        boolean exists = restHighLevelClient.indices().exists(new GetIndexRequest("spring-data3"), RequestOptions.DEFAULT);
        if (exists) {
            // 删除index
            AcknowledgedResponse delete = restHighLevelClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
            System.out.println(delete.isAcknowledged());
        }

    }

    // 获取文档内容
    @Test
    void myTest4() throws IOException {
        GetRequest getRequest = new GetRequest("users", "1");
        boolean exists = restHighLevelClient.indices().exists(new GetIndexRequest(getRequest.index()), RequestOptions.DEFAULT);
        if (exists) {
            GetResponse getResponse = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
            System.out.println(getResponse.getSourceAsString());
        } else {
            System.out.println("索引不存在!");
        }
        restHighLevelClient.close();
    }

    // 搜索index为users下的所有文档
    @Test
    void myTest5() throws IOException {
        SearchRequest searchRequest = new SearchRequest("users");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchRequest.source(searchSourceBuilder);
        SearchResponse search = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        SearchHit[] hits = search.getHits().getHits();
        for (SearchHit hit : hits) {
            System.out.println(hit.getSourceAsString());
            System.out.println("=================================");
        }

    }
}
