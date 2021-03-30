package java进阶.demo03Recursio;

public class Demo0302Main
{
    public static void main(String[] args)
    {
        int result=sum(100);
        System.out.println(result);
    }

    // 使用递归求1到n的和
    public static int sum(int n)
    {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
