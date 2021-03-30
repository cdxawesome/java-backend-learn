package java基础.demo08多态;

public class Student extends Person
{
    int num = 20;

    @Override
    public void showNum()
    {
        System.out.println(num);
    }

    public void methodSpecial()
    {
        System.out.println("这是子类特有的方法");
    }
}
