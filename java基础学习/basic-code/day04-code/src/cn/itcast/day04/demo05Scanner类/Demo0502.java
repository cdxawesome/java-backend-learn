package cn.itcast.day04.demo05Scanner类;

import java.util.Scanner;

public class Demo0502
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }

    public static int sum(int a, int b, int c)
    {
        int temp1 = a > b ? a : b;
        int temp2 = temp1 > c ? temp1 : c;
        return temp2;
    }
}
