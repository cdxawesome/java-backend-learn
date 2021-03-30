package JavaWeb.reflect.demo01;

public class Demo0101Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class cls1 = Class.forName("JavaWeb.reflect.demo01.Person");
        System.out.println(cls1);

        Class cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls3);
        System.out.println(cls1 == cls2);
    }
}
