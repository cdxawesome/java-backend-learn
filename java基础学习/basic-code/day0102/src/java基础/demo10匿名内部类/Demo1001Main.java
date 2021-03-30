package java基础.demo10匿名内部类;

public class Demo1001Main
{
    public static void main(String[] args)
    {
        // 普通方式
        MyInterface one = new MyInterfaceImpl();
        one.func();

        // 匿名内部类的方式
        MyInterface two = new MyInterface()
        {
            @Override
            public void func()
            {
                System.out.println("匿名内部类的成员方法重写了接口的方法");
            }
        };

        two.func();

    }
}
