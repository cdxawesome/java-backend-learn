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
        // ?????????springboot??????????????????????????????????????????????????????
        IndexRequest request = new IndexRequest("spring-data", "elasticsearch", "1")
                .source("feature", "high-level-rest-client")
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);

        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.toString());
        restHighLevelClient.close();
    }

    @Test
    void myTest() throws IOException {
        // ?????????????????????????????????????????????request?????????(????????????springboot?????????????????????)
        IndexRequest request = new IndexRequest("spring-data3")
                .id("1")
                .opType(DocWriteRequest.OpType.CREATE)
                .source("name", "rico2")
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(response.toString());
        restHighLevelClient.close();
    }


    // ????????????
    @Test
    void myTest3() throws IOException {
        // ????????????index???request
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("spring-data3");
        // ??????index????????????
        boolean exists = restHighLevelClient.indices().exists(new GetIndexRequest("spring-data3"), RequestOptions.DEFAULT);
        if (exists) {
            // ??????index
            AcknowledgedResponse delete = restHighLevelClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
            System.out.println(delete.isAcknowledged());
        }

    }

    // ??????????????????
    @Test
    void myTest4() throws IOException {
        GetRequest getRequest = new GetRequest("users", "1");
        boolean exists = restHighLevelClient.indices().exists(new GetIndexRequest(getRequest.index()), RequestOptions.DEFAULT);
        if (exists) {
            GetResponse getResponse = restHighLevelClient.get(getRequest, RequestOptions.DEFAULT);
            System.out.println(getResponse.getSourceAsString());
        } else {
            System.out.println("???????????????!");
        }
        restHighLevelClient.close();
    }

    // ??????index???users??????????????????
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

    // ???????????????27??????????????????
    @Test
    void myTest6() {
        User rico = myRepository.findByIdOrAgeOrName(null, 27, null);
        System.out.println(rico);
    }


    // ????????????user??????
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

    // ???????????????????????????29?????????????????????
    @Test
    void myTest8() throws IOException {
        myRepository.deleteByAgeGreaterThanEqual(29);
        restHighLevelClient.close();
    }

    // ??????elasticsearchRestTemplate???????????????
    @Test
    void myTest9() {
        // ????????????query???QueryBuilders???????????????????????????
        NativeSearchQuery nativeSearchQuery = new NativeSearchQuery(QueryBuilders.matchAllQuery());
        SearchHits<User> search = elasticsearchRestTemplate.search(nativeSearchQuery, User.class);
        for (org.springframework.data.elasticsearch.core.SearchHit<User> userSearchHit : search) {
            User content = userSearchHit.getContent();
            System.out.println(content);
        }
    }

    @Test
    void myTest10() {
        // ????????????query???QueryBuilders???????????????????????????
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
        // ??????age??????27???user??????,????????????????????????json???????????????????????????????????????
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

    // ??????users?????????????????????????????????
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

    // ??????????????????10??????????????????????????????restHighLevelClient
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

    // ??????????????????10??????????????????????????????elasticsearchRestTemplate
    // ???????????????restHighLevelClient????????????elasticsearchRestTemplate???????????????ElasticsearchRepository????????????????????????restHighLevelClient
    // ???????????????????????????????????????????????????????????????json?????????????????????
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
