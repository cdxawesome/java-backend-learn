package cn.itcast.day04.demo07ArrayList;

import java.util.ArrayList;

public class Demo0704
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        Print(arrayList);
    }

    public static void Print(ArrayList<String> arrayList)
    {
        int i;
        System.out.print("{");
        for (i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i));
            if (i != arrayList.size() - 1)
            {
                System.out.print("@");
            }
        }
        System.out.print("}");
    }
}
