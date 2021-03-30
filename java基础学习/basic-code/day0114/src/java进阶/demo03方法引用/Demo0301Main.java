package java进阶.demo03方法引用;

public class Demo0301Main
{
    public static void func(MyFunctionalInterface mf)
    {
        mf.printString("Hello World!");
    }

    public static void main(String[] args)
    {
        // 一般的Lambda表达式写法
        func(name -> System.out.println(name));

        // 使用引用的Lambda写法
        func(System.out::println);
    }
}
