package JavaWeb.annotation;

@SuppressWarnings("all")
public class AnnoDemo01
{
    private int a;

    /**
     * 求两个整数的和
     *
     * @param a 整数
     * @param b 整数
     * @return a加b的和
     */
    @Deprecated
    public int add(int a, int b)
    {
        return a + b;
    }

    /**
     * 返回n个整数的和
     *
     * @param a 传入n个整数
     * @return 返回所有整数的和
     */
    public int add(int... a)
    {
        int sum = 0;
        for (int i : a)
        {
            sum += i;
        }
        return sum;
    }

    public void func()
    {
        int add = add(1, 2, 3, 4, 5);
        System.out.println(add);
    }

    public static void main(String[] args)
    {
        new AnnoDemo01().func();
    }
}
