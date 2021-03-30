package java进阶.demo02Stream;

/*
问题：
有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
* */

import java.util.Arrays;

public class Demo0203Main
{
    public static void main(String[] args)
    {
        String[] masters = {"黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"};
        String[] array = Arrays.stream(masters).filter((name) -> name.startsWith("郭")).toArray(String[]::new);
        for (String s : array)
        {
            System.out.println(s);
        }
    }
}
