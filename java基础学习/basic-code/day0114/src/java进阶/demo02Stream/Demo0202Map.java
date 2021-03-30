package java进阶.demo02Stream;

import java.util.stream.Stream;

public class Demo0202Map
{
    public static void main(String[] args)
    {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");

        // 普通的写法
//        Stream<Integer> stream2 = stream1.map((value) -> Integer.parseInt(value) + 1);
//        stream2.forEach(value-> System.out.println(value));

        // 优雅的写法
        stream1.map(value->Integer.parseInt(value)+1)
                .forEach(value-> System.out.println(value));
    }
}
