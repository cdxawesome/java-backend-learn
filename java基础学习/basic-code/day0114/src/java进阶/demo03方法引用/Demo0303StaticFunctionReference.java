package java进阶.demo03方法引用;

public class Demo0303StaticFunctionReference
{
    public static int method(int n, Calculable calc)
    {
        return calc.getAbs(n);
    }

    public static void main(String[] args)
    {
        // 普通的Lambda表达式写法
        int result = method(-10, (n) -> Math.abs(n));
        System.out.println(result);

        // 使用静态方法引用
        int result2 = method(-20, Math::abs);
        System.out.println(result2);
    }
}
