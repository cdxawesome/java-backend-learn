package java进阶.demo05常用的函数式接口;

import java.util.function.Function;

public class Demo0511Function
{
    public static void changeType(String str, Function<String, Integer> func)
    {
        int value = func.apply(str);
        System.out.println(--value);
    }

    public static void main(String[] args)
    {
        String value = "1234";
        // 这是个什么操作?输出结果正确
//        changeType(value, Integer::parseInt);

        changeType(value,(str)->Integer.parseInt(str));
    }
}
