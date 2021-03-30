package java基础.demo03;

public class Demo0302Summation
{
    public static void main(String[] args)
    {
        System.out.println(sum(100));
    }

    public static int sum(int range)
    {
        int sum = 0;
        for (int i = 1; i <= range; i++)
        {
            sum += i;
        }

        return sum;
    }
}
