package java进阶.demo07可变参数;

public class Demo0701Main
{
    public static void main(String[] args)
    {
        int result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(result);
    }

    public static int sum(int... value)
    {
        int sum = 0;
        for (int i : value)
        {
            sum += i;
        }

        return sum;
    }
}
