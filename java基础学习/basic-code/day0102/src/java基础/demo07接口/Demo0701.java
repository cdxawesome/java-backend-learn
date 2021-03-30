package java基础.demo07接口;

public class Demo0701
{
    public static void main(String[] args)
    {
        MyInterfaceImpl one = new MyInterfaceImpl();
        one.method01();
        one.method02();
        one.method03();
        one.method04();
        MyInterface.method05();
    }
}
