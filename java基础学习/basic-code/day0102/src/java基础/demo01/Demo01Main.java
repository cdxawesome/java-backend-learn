package java基础.demo01;

public class Demo01Main
{
    public static void main(String[] args)
    {
        Student one = new Student("小明", 23);
        one.classroom="101";
        System.out.println(one.getId());
        System.out.println(one.classroom);
        Student two=new Student("小白",24);
        System.out.println(two.getId());
        System.out.println(two.classroom);
    }
}
