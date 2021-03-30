package java进阶复习.demo01Collection;

/*ArrayList集合中有如下内容： {33,11,77,55}，使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。*/

import java.util.ArrayList;
import java.util.Collections;

public class Demo0111Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(33);
        arrayList.add(11);
        arrayList.add(77);
        arrayList.add(55);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
