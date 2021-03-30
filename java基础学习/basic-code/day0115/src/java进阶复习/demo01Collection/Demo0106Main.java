package java进阶复习.demo01Collection;

/*定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/

import java.util.ArrayList;

public class Demo0106Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(2);
        System.out.println(listTest(integerArrayList, 5));
    }

    public static int listTest(ArrayList<Integer> al, Integer s)
    {
        for (int i = 0; i < al.size(); i++)
        {
            if (al.get(i).equals(s))
                return i;
        }
        return -1;
    }
}
