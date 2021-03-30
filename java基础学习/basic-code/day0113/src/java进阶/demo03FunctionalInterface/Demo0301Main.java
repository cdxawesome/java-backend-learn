package java进阶.demo03FunctionalInterface;

public class Demo0301Main
{
    public static void main(String[] args)
    {
        // 使用接口的实现类
        func(new MyFunctionalInterfaceImpl());

        // 使用接口的匿名内部类
        func(new MyFunctionalInterface()
        {
            @Override
            public void method1()
            {
                System.out.println("使用接口的匿名内部类重写了方法");
            }
        });

        // 使用Lambda表达式
        func(()->{
            System.out.println("使用了Lambda表达式重写了方法");
        });

        // 简化Lambda表达式
        func(()-> System.out.println("使用了简化的Lambda表达式重写了方法"));
    }

    public static void func(MyFunctionalInterface mfi)
    {
        mfi.method1();
    }
}
