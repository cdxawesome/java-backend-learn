package java进阶.demo05常用的函数式接口;

import java.util.function.Predicate;

public class Demo0508Predicate_or
{
    public static boolean checkString(String str, Predicate<String> pre1, Predicate<String> pre2)
    {
        return pre1.or(pre2).test(str);
    }

    public static void main(String[] args)
    {
        String s = "bcdeas";
        boolean b = checkString(s,
                (str) -> str.length() > 5,
                (str) -> str.contains("a")
        );

        System.out.println(b);
    }
}
