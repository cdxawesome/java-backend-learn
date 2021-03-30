package java进阶.demo03FunctionalInterface;

public class MyFunctionalInterfaceImpl implements MyFunctionalInterface
{
    @Override
    public void method1()
    {
        System.out.println("接口的实现类重写了方法");
    }
}
