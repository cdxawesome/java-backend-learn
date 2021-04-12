package com.rico.test;

import com.ricorich.SpringbootEsApplication;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest(classes = SpringbootEsApplication.class)
@RunWith(SpringRunner.class)
public class ElasticsearchSpringbootTest {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void test01() throws IOException {
        // 构建请求
        GetRequest request=new GetRequest("book","2");

        // 执行请求
        GetResponse getResponse = restHighLevelClient.get(request, RequestOptions.DEFAULT);

        // 获取数据
        System.out.println(getResponse.getId());
        System.out.println(getResponse.getVersion());
        System.out.println(getResponse.getSourceAsString());

    }
}
