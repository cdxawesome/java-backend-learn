package java进阶复习.demo01Collection;

/*定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s*/

import java.util.ArrayList;

public class Demo0104Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("s");
        System.out.println(listTest(arrayList, "s"));
    }

    public static boolean listTest(ArrayList<String> al, String s)
    {
        return al.contains(s);
    }
}
