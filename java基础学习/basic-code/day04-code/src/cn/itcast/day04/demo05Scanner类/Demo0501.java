package cn.itcast.day04.demo05Scanner类;

import java.util.Scanner;

public class Demo0501
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int result = sum(sc.nextInt(),sc.nextInt());
        System.out.println(result);
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }
}
