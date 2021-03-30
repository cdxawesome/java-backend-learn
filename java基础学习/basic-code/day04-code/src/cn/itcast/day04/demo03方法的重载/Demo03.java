package cn.itcast.day04.demo03方法的重载;

public class Demo03
{
    public static void main(String[] args)
    {
        int a, b, c, d;
        a = b = c = d = 10;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(a, b, c, d));
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
}
