package java进阶.demo02Exception;

public class Demo0201System
{
    public static void main(String[] args)
    {
        long s = System.currentTimeMillis();
        for (int i = 1; i <= 9999; i++)
        {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();

        System.out.println("程序用时: "+(e-s)+"毫秒");
    }
}
