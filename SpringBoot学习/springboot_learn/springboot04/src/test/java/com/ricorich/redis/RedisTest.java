package com.ricorich.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Set;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1() {
        // string字符串
        // 下面两种写法是一样的效果，二选一
//        redisTemplate.opsForValue().set("str","ricorich");
        redisTemplate.boundValueOps("str").set("ricorich");

        // hash散列
        redisTemplate.boundHashOps("h_key").put("name", "ricorich");
        redisTemplate.boundHashOps("h_key").put("age", 18);
        // 获取所有域
        Set set = redisTemplate.boundHashOps("h_key").keys();
        System.out.println("hash散列的所有域:" + set);
        // 获取所有值
        List list = redisTemplate.boundHashOps("h_key").values();
        System.out.println("hash散列的所有值：" + list);

        // list列表
        redisTemplate.boundListOps("l_key").leftPush("c");
        redisTemplate.boundListOps("l_key").leftPush("b");
        redisTemplate.boundListOps("l_key").leftPush("a");
        // 获取全部元素
        list = redisTemplate.boundListOps("l_key").range(0, -1);
        System.out.println("list列表中所有的值:" + list);

        // set 集合
        redisTemplate.boundSetOps("s_key").add("a", "b", "c");
        set = redisTemplate.boundSetOps("s_key").members();
        System.out.println("set集合中的所有元素:" + set);

        // sorted set 有序集合
        redisTemplate.boundZSetOps("z_key").add("a", 30);
        redisTemplate.boundZSetOps("z_key").add("b", 20);
        redisTemplate.boundZSetOps("z_key").add("c", 10);
        set = redisTemplate.boundZSetOps("z_key").range(0, -1);
        System.out.println("sorted set有序集合中的所有元素:" + set);
    }
}
