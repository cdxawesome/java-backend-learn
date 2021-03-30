package java进阶.demo05常用的函数式接口;

import java.util.function.Predicate;

public class Demo0509Predicate_negate
{
    public static boolean checkString(String str, Predicate<String> pre1)
    {
        return pre1.negate().test(str);
    }

    public static void main(String[] args)
    {
        String s = "bcde";
        boolean b = checkString(s,
                (str) -> str.length() > 5
        );

        System.out.println(b);
    }
}
