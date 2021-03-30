package java进阶复习.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:" + listTest(list, "a"));
        System.out.println("b:" + listTest(list, "b"));
        System.out.println("c:" + listTest(list, "c"));
        System.out.println("xxx:" + listTest(list, "xxx"));
    }

    /*统计集合中指定元素出现的次数，返回这个次数的String*/
    private static String listTest(Collection<String> list, String a)
    {
        int count = 0;
        for (String s : list)
        {
            if (a.equals(s))
                count++;
        }
        return String.valueOf(count);
    }

}
