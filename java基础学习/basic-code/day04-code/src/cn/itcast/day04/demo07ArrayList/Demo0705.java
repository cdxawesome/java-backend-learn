package cn.itcast.day04.demo07ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Demo0705
{
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            arrayList.add(r.nextInt(100) + 1);
        }
        System.out.println("随机集合的元素是:"+arrayList);
        ArrayList<Integer> evenNumbers=GetEvenNumber(arrayList);
        System.out.println("筛选出的偶数集合是:"+evenNumbers);
    }

    public static ArrayList<Integer> GetEvenNumber(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer integer : arrayList)
        {
            if (integer % 2 == 0)
                evenNumbers.add(integer);
        }
        return evenNumbers;
    }
}
