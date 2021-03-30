package java进阶.demo05常用的函数式接口;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo0513FunctionExercise
{
    public static int getValue(String str, Function<String, String> func1, Function<String, Integer> func2, Function<Integer, Integer> func3)
    {
        return func1.andThen(func2).andThen(func3).apply(str);
    }

    public static void main(String[] args)
    {
        String str = "赵丽颖,20";
        int resultInt = getValue(str,
                (s) -> s.split(",")[1],
                (s) -> Integer.parseInt(s),
                (s) -> s + 100
        );

        System.out.println(resultInt);
    }
}
