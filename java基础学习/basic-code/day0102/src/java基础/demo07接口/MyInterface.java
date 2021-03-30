package java基础.demo07接口;

public interface MyInterface
{
    void method01();

    void method02();

    void method03();

    default void method04()
    {
        System.out.println("这是接口的默认方法");
        privateMethod();
    }

    static void method05()
    {
        System.out.println("这是接口的静态方法");
        privateStaticMethod();
    }

    private void privateMethod()
    {
        System.out.println("这是接口的私有方法");
    }

    private static void privateStaticMethod()
    {
        System.out.println("这是接口的静态私有方法");
    }
}
