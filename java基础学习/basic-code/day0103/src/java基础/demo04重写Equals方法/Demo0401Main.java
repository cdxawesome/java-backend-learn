package java基础.demo04重写Equals方法;

public class Demo0401Main
{
    public static void main(String[] args)
    {
        Student one = new Student("张三", 19);
        Student two = new Student("张三", 19);
        System.out.println(one.equals(two));
    }
}
