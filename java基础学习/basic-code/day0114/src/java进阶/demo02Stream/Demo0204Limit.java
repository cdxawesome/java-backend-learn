package java进阶.demo02Stream;

import java.util.stream.Stream;

public class Demo0204Limit
{
    public static void main(String[] args)
    {
        Stream.of("大宝", "二宝", "三宝", "四宝", "小宝").limit(3).forEach(str -> System.out.println(str));
    }
}
