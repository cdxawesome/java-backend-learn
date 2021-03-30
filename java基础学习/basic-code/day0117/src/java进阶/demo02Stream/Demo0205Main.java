package java进阶.demo02Stream;

import java.util.stream.Stream;

public class Demo0205Main
{
    public static void main(String[] args)
    {
        /*问题：
            有如下整数1，-2，-3，4，-5
            使用Stream取元素绝对值并打印*/
        Stream<Integer> s = Stream.of(1, -2, -3, 4, -5);
        s.map(Math::abs).forEach(System.out::println);
    }
}
