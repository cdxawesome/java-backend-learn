package java基础.demo09内部类;

public class Demo09InnerClass
{
    // 外部类的成员变量
    private String name;
    private int num = 10;

    // 内部类
    public class Inner
    {
        private int num = 20;

        public void innerMethod()
        {
            int num = 30;
            System.out.println("使用内部类的成员方法");
            outerMethod();
            System.out.println(name);
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Demo09InnerClass.this.num);
        }
    }

    public void outerMethod()
    {
        System.out.println("外部类成员方法");
    }

    public void useInnerClass()
    {
        Inner in = new Inner();
        in.innerMethod();
    }
}
