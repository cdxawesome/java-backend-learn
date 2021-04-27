package com.rico.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        // 这个是springboot的文档推荐写法
//        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("192.168.203.129:9200").build();
//
//        return RestClients.create(clientConfiguration).rest();

        // es官方文档推荐写法
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.203.129", 9200, "http")));
        return client;
    }
}
