package com.ricorich.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ElasticsearchConfig {

    @Value("${rico.elasticsearch.hostlist}")
    private String hostList;


    @Bean(destroyMethod = "close")
    public RestHighLevelClient restHighLevelClient() {
        // 因为节点数可能有多个，所以这里用逗号分割
        String[] split = hostList.split(",");
        HttpHost[] httpHosts = new HttpHost[split.length];
        // 将结点的url转成HttpHost
        for (int i = 0; i < split.length; i++) {
            httpHosts[i] = new HttpHost(split[i].split(":")[0], Integer.parseInt(split[i].split(":")[1]));
        }
        return new RestHighLevelClient(RestClient.builder(httpHosts));
    }
}
