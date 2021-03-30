package java进阶.demo02Stream;

import java.util.stream.Stream;

public class Demo0201Filter
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "赵敏", "周芷若", "张翠山");
        Stream<String> stream2 = stream.filter(name -> name.startsWith("张"));
        stream2.forEach(name-> System.out.println(name));
    }
}
