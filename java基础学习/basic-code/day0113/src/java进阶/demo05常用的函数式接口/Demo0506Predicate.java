package java进阶.demo05常用的函数式接口;

import java.util.function.Predicate;

public class Demo0506Predicate
{
    public static boolean checkString(String str, Predicate<String> pre)
    {
        return pre.test(str);
    }

    public static void main(String[] args)
    {
        String str = "abcdef";
        boolean b = checkString(str,
                (s) -> s.length() > 5
        );

        System.out.println(b);
    }
}
