package java基础.demo09内部类;

public class Demo0901Main
{
    public static void main(String[] args)
    {
        Demo09InnerClass innerClass = new Demo09InnerClass();
        innerClass.useInnerClass();
        Demo09InnerClass.Inner inner = new Demo09InnerClass().new Inner();
        inner.innerMethod();

    }
}
