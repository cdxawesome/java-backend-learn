package java进阶.demo05常用的函数式接口;

import java.util.function.Consumer;

public class Demo0503Consumer
{
    public static void consumerStr(String name, Consumer<String> cs)
    {
        cs.accept(name);
    }

    public static void main(String[] args)
    {
        consumerStr("Dylan", (String name) ->
        {
            String rename = new StringBuilder(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
