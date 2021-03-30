package java进阶复习.demo01Collection;

import java.util.ArrayList;

public class Demo0102Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> arrayList = changeIntToArray(arr);
        System.out.println(arrayList);
    }

    /*传入一个数组，将数组转换成具有相同元素的集合*/
    public static ArrayList<Integer> changeIntToArray(int[] arr)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr)
        {
            arrayList.add(i);
        }
        return arrayList;
    }
}
