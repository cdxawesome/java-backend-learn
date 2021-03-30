package cn.itcast.day04.demo07ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Demo0702
{
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0;
        for (i = 0; i < 6; i++)
        {
            arrayList.add(r.nextInt(33) + 1);
        }

        for(i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));
    }
}
