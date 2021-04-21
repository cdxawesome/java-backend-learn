package com.rico.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rico.pojo.User;
import com.rico.service.RedisService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1() {
        redisService.set("a", 100);
        Object a = redisService.get("a");
        System.out.println(a);
    }

    @Test
    public void test2() {
        User user = new User();
        user.setId(1L);
        user.setName("rico");
        user.setAge(27);
        redisService.set("user", user);

        // 配置了Serializer的RedisTemplate，可以直接将获得json字符串转成对象
        User user1 = (User) redisService.get("user");
        System.out.println(user1.getAge());
        System.out.println(redisService.get("user"));

    }

    @Test
    public void test3() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("一", 1);
        myMap.put("二", 2);
        myMap.put("三", 3);
        myMap.put("四", 4);
        JSONObject jsonObject = new JSONObject(myMap);
        redisService.set("jsonValue", myMap);

        Object jsonValue = redisService.get("jsonValue");
        // 上面将map转成了json，这里打印出的是json字符串。如果直接存入map，获取到数据就是map
        System.out.println(jsonValue);
    }

    @Test
    public void test4(){
        User user = new User();
        user.setId(1L);
        user.setName("rico");
        user.setAge(27);
        // 直接存储对象
        redisTemplate.opsForValue().set("user2",user);
        // 没有配置Serializer的RedisTemplate，也可以直接将获得json字符串转成对象
        User user2 = (User) redisTemplate.opsForValue().get("user2");
        System.out.println(user2.getName());
        System.out.println(redisTemplate.opsForValue().get("user2"));
    }
}
