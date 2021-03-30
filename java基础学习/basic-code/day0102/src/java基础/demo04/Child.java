package java基础.demo04;

public class Child extends Father
{
    public Child()
    {
//        super();
        System.out.println("子类的无参构造方法");
    }

    public Child(int a)
    {
//        super(a);
        System.out.println("子类有参的构造方法");
    }

    @Override
    public void Method()
    {
        super.Method();
        System.out.println("子类重写了父类的方法");
    }
}
