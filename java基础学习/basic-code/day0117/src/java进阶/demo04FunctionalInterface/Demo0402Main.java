package java进阶.demo04FunctionalInterface;

public class Demo0402Main
{
    static void getProduct(int a, int b, IntCalc calc)
    {
        System.out.println(calc.calc(a, b));
    }

    public static void main(String[] args)
    {
        getProduct(2, 3, (a, b) -> a * b);
    }
}
