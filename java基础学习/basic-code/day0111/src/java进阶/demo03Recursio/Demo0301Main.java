package java进阶.demo03Recursio;

public class Demo0301Main
{
    public static void main(String[] args)
    {
        show01(1);
    }

    private static void show01(int a)
    {
        if(a==20000)
            return;
        System.out.println(a);
        show01(++a);
    }
}
