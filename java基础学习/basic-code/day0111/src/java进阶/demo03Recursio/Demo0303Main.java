package java进阶.demo03Recursio;

public class Demo0303Main
{
    public static void main(String[] args)
    {
        int result = fact(10);
        System.out.println(result);
    }

    // 使用递归求n的阶乘
    public static int fact(int n)
    {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
