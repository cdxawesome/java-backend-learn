package com.rico;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rico.domain.User;
import com.rico.repository.MyRepository;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.lucene.queries.function.FunctionValues;
import org.apache.lucene.util.Counter;
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
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.filter.Filter;
import org.elasticsearch.search.aggregations.bucket.filter.FilterAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.Avg;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.ValueCount;
import org.elasticsearch.search.aggregations.metrics.ValueCountAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class EsApiApplicationTests {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Autowired
    private MyRepository myRepository;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

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

    // 查询年龄为27岁的用户数据
    @Test
    void myTest6() {
        User rico = myRepository.findByIdOrAgeOrName(null, 27, null);
        System.out.println(rico);
    }


    // 插入一条user数据
    @Test
    void myTest7() throws IOException {
        User user = User.builder()
                .name("rico3")
                .age(35)
                .id(3L)
                .birthday(new Date())
                .build();

        User save = myRepository.save(user);
        System.out.println(save);
        restHighLevelClient.close();
    }

    // 删除年龄大于或等于29岁的用户的数据
    @Test
    void myTest8() throws IOException {
        myRepository.deleteByAgeGreaterThanEqual(29);
        restHighLevelClient.close();
    }

    // 使用elasticsearchRestTemplate来查询数据
    @Test
    void myTest9() {
        // 创建一个query，QueryBuilders下可以选择查询方式
        NativeSearchQuery nativeSearchQuery = new NativeSearchQuery(QueryBuilders.matchAllQuery());
        SearchHits<User> search = elasticsearchRestTemplate.search(nativeSearchQuery, User.class);
        for (org.springframework.data.elasticsearch.core.SearchHit<User> userSearchHit : search) {
            User content = userSearchHit.getContent();
            System.out.println(content);
        }
    }

    @Test
    void myTest10() {
        // 创建一个query，QueryBuilders下可以选择查询方式
        NativeSearchQuery nativeSearchQuery = new NativeSearchQuery(QueryBuilders.matchAllQuery());
        SearchHits<User> search = elasticsearchRestTemplate.search(nativeSearchQuery, User.class);
        for (org.springframework.data.elasticsearch.core.SearchHit<User> userSearchHit : search) {
            User content = userSearchHit.getContent();
            System.out.println(content);
        }
    }

    @Test
    void myTest11() {
        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();
        builder.withQuery(QueryBuilders.matchAllQuery());
        // 搜索age大于27的user数据,这里的写法其实和json查询语句的写法一样的，如下
        /*
        GET /bank/_search
        {
          "query": {
            "bool": {
              "must": { "match_all": {} },
              "filter": {
                "range": {
                  "balance": {
                    "gte": 20000,
                    "lte": 30000
                  }
                }
              }
            }
          }
        }
         */
        builder.withQuery(QueryBuilders.boolQuery()
                .must(QueryBuilders.matchAllQuery())
                .filter(QueryBuilders.rangeQuery("age").gte(27)));
        NativeSearchQuery query = builder.build();
        SearchHits<User> searchHits = elasticsearchRestTemplate.search(query, User.class);
        for (org.springframework.data.elasticsearch.core.SearchHit<User> searchHit : searchHits) {
            System.out.println(searchHit.getContent());
        }
    }

    // 查询users下所有用户的年龄平均值
    @Test
    public void myTest12() throws IOException {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        AvgAggregationBuilder avgAggregationBuilder = AggregationBuilders.avg("average_age").field("age");
        searchSourceBuilder.aggregation(avgAggregationBuilder);

        SearchRequest request = new SearchRequest("users");
        request.source(searchSourceBuilder);

        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        Aggregations aggregations = response.getAggregations();
        Avg average_age = aggregations.get("average_age");
        System.out.println(average_age.getValue());
    }

    // 查询年龄大于10岁的用户的数量，使用restHighLevelClient
    @Test
    public void myTest13() throws IOException {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        FilterAggregationBuilder filter = AggregationBuilders
                .filter("age_gt_10", QueryBuilders.rangeQuery("age").gt(10));
        filter.subAggregation(AggregationBuilders.count("group_by_count").field("name"));
        searchSourceBuilder.aggregation(filter);

        SearchRequest request = new SearchRequest("users");
        request.source(searchSourceBuilder);

        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        Aggregations aggregations = response.getAggregations();
        Filter age_gt_10 = aggregations.get("age_gt_10");
        Aggregations aggregations1 = age_gt_10.getAggregations();
        ValueCount group_by_count = aggregations1.get("group_by_count");
        System.out.println(group_by_count.getValue());
    }

    // 查询年龄大于10岁的用户的数量，使用elasticsearchRestTemplate
    // 不管是使用restHighLevelClient还是使用elasticsearchRestTemplate，还是使用ElasticsearchRepository，都需要先初始化restHighLevelClient
    // 当使用前两者的时候，要注意查询的语法，对照json格式的请求语法
    @Test
    public void myTest14() {
        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();
        builder.addAggregation(AggregationBuilders
                .filter("age_gt_10", QueryBuilders.rangeQuery("age").gt(10))
                .subAggregation(AggregationBuilders.count("group_by_count").field("name")));
        NativeSearchQuery searchQuery = builder.build();
        SearchHits<User> search = elasticsearchRestTemplate.search(searchQuery, User.class);
        Filter age_gt_10 = search.getAggregations().get("age_gt_10");
        Aggregations aggregations = age_gt_10.getAggregations();
        ValueCount count = aggregations.get("group_by_count");
        System.out.println(count.getValue());
    }
}
