package java基础.demo01;

public class Person
{
    static
    {
        System.out.println("静态代码块执行!");
    }

    public Person()
    {
        System.out.println("无参数构造方法执行!");
    }
}
