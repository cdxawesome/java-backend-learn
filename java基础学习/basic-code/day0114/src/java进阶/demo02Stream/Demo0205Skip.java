package java进阶.demo02Stream;

import java.util.stream.Stream;

public class Demo0205Skip
{
    public static void main(String[] args)
    {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.skip(3).forEach(value-> System.out.println(value));
    }
}
