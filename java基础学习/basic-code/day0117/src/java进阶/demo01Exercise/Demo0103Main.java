package java进阶.demo01Exercise;

/*定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
定义replace方法，将某集合中的某元素，全部替换为新元素。*/

import java.util.ArrayList;
import java.util.List;

public class Demo0103Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(22);
        int index = findIndex(arrayList, 9);
        System.out.println(index);
        replace(arrayList, 0, 100);
        System.out.println(arrayList);
    }

    private static int findIndex(List<Integer> list, int value)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(value))
                return i;
        }
        return -1;
    }

    private static void replace(List<Integer> list, int index, int value)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (i == index)
            {
                list.set(index, value);
            }
        }
    }
}
