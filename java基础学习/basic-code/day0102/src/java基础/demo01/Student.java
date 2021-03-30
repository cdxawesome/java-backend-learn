package java基础.demo01;

public class Student
{
    private int id;
    private static int idCount;
    private String name;
    private int age;
    public static String classroom;


    public Student()
    {
        this.id=++idCount;
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }



}
