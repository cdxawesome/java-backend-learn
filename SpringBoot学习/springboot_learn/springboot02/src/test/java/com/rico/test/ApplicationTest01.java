package com.rico.test;

import com.rico.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest01 {
    private MockMvc mvc;

    @Before
    public void setUp() {
        // 初始化MockMvc
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testUserController() throws Exception {
        // 测试UserController
        MockHttpServletRequestBuilder request;
        // 1.get查一下user列表，应该为空
        mvc.perform(MockMvcRequestBuilders.get("/users/"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        // 2.post提交一个user
        request = MockMvcRequestBuilders.post("/users/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":1,\"name\":\"test\",\"age\":20}");
        mvc.perform(request).andExpect(content().string(equalTo("success")));

        // 3.get获取user列表，应该有刚才插入的数据
        request = MockMvcRequestBuilders.get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"test\",\"age\":20}]")));

        // 4.put修改id为1的user
        request = MockMvcRequestBuilders.put("/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"test2\",\"age\":30}");
        mvc.perform(request).andExpect(content().string(equalTo("success")));

        // 5.get一个id为1的user
        request = MockMvcRequestBuilders.get("/users/1");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"test2\",\"age\":30}")));

        // 6.del删除一个id为1的user
        request = MockMvcRequestBuilders.delete("/users/1");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 7. get查一下user列表，应该为空
        mvc.perform(MockMvcRequestBuilders.get("/users/"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

    }
}
