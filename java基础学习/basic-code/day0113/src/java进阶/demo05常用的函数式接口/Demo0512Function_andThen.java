package java进阶.demo05常用的函数式接口;

import java.util.function.Function;

public class Demo0512Function_andThen
{
    public static void changeType(String str, Function<String, Integer> func1, Function<Integer, String> func2)
    {
        String value = func1.andThen(func2).apply(str);
        System.out.println(value);
    }

    public static void main(String[] args)
    {
        String value = "20";

        changeType(value,
                (str) -> Integer.parseInt(str) + 10,
                (str) -> String.valueOf(str)
        );
    }
}
