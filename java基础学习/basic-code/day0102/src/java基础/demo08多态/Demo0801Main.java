package java基础.demo08多态;

public class Demo0801Main
{
    public static void main(String[] args)
    {
        Person p1=new Student();
        System.out.println(p1.num);
        p1.showNum();
        if(p1 instanceof Student)
        {
            Student s1=(Student) p1;
            s1.methodSpecial();
        }

    }
}
