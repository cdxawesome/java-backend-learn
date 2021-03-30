package java进阶.demo05常用的函数式接口;

import java.util.function.Consumer;

public class Demo0504Consumer_andThen
{
    public static void consumerStr(String name, Consumer<String> con1, Consumer<String> con2)
    {
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args)
    {
        consumerStr("Dylan",
                (name) -> System.out.println(name.toLowerCase()),
                (name) -> System.out.println(name.toUpperCase())
        );
    }
}
