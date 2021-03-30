package java进阶.demo03泛型;

public class Demo0302GenericFunc
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        func01(10,20);
        func01("Hello","World");
    }

    public static <T> void func01(T a, T b)
    {
        String str = String.valueOf(a) +
                b;
        System.out.println(str);
    }
}
