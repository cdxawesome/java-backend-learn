package cn.itcast.day04.demo03方法的重载;

public class Practise01
{
    public static void main(String[] args)
    {
        byte b1 = 1;
        byte b2 = 2;

        short s1 = 10;
        short s2 = 11;

        long l1 = 100;
        long l2 = 100;

        System.out.println(isEqual(b1, b2));
        System.out.println(isEqual(s1, s2));
        System.out.println(isEqual(l1, l2));
    }

    public static boolean isEqual(byte b1, byte b2)
    {
        return b1 == b2;
    }

    public static boolean isEqual(short b1, short b2)
    {
        return b1 == b2;
    }

    public static boolean isEqual(long b1, long b2)
    {
        return b1 == b2;
    }
}
