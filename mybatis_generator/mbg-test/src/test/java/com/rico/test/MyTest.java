package com.rico.test;

import com.rico.mapper.TabCategoryMapper;
import com.rico.model.TabCategory;
import com.rico.model.TabCategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Autowired
    private TabCategoryMapper tabCategoryMapper;

    @Test
    public void test1()
    {
        List<TabCategory> tabCategories = tabCategoryMapper.selectByExample(new TabCategoryExample());
        System.out.println(tabCategories);
    }

    @Test
    public void test2()
    {
        long l = tabCategoryMapper.countByExample(new TabCategoryExample());
        System.out.println(l);
    }

    @Test
    public void test3()
    {
        TabCategory tabCategory=new TabCategory();
        tabCategory.setCid(9);
        tabCategory.setCname("新增分类1");
        int insert = tabCategoryMapper.insert(tabCategory);
        System.out.println(insert);
    }
}
