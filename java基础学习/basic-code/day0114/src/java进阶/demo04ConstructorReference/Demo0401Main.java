package java进阶.demo04ConstructorReference;

public class Demo0401Main
{
    public static void printPerson(String name, PersonBuilder pb)
    {
        Person person = pb.buildPerson(name);
        System.out.println(person);
    }

    public static void main(String[] args)
    {
        /*使用类的构造器引用*/

        // 普通Lambda写法
        printPerson("迪丽热巴", (name) -> new Person(name));

        // 使用方法引用优化Lambda
        printPerson("古力娜扎",Person::new);
    }
}
