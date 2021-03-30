package java进阶.demo01Lambda;

public class Demo0103Main
{
    public static void main(String[] args)
    {
        // 这里的Lambda括号里的参数不写int也可以
        invokeCalc(10, 20, (int a, int b) ->
        {
            return a + b;
        });

        // 省略的写法
        invokeCalc(10, 30, (a, b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator)
    {
        int result = calculator.calc(a, b);
        System.out.println("结果:" + result);
    }
}
