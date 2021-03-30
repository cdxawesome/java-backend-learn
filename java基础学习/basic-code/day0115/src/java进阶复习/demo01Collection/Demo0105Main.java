package java进阶复习.demo01Collection;

/*六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/

import java.util.ArrayList;

public class Demo0105Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("s");
        System.out.println(listTest(arrayList));
    }

    public static boolean listTest(ArrayList<String> al)
    {
        return al.isEmpty();
    }
}
