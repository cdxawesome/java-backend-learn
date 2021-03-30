package java进阶.demo05常用的函数式接口;

import java.util.function.Supplier;

public class Demo0501Supplier
{
    public static String getString(Supplier<String> sl)
    {
        return sl.get();
    }

    public static void main(String[] args)
    {
        String str = getString(() -> "哈哈");
        System.out.println(str);
    }
}
