package java基础.demo03;

public class Demo0301IsEqual
{
    public static void main(String[] args)
    {
        double a = 10.0;
        int b = 10;
        System.out.println(isEqual(a, b));
    }

    public static boolean isEqual(double a, double b)
    {
        return a == b;
    }
}
