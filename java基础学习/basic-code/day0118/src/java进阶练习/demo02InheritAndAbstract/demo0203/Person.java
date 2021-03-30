package java进阶练习.demo02InheritAndAbstract.demo0203;

public class Person
{
    private String name;
    private int age;

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void showMsg()
    {
        System.out.println("姓名:" + name + ",年龄:" + age);
    }
}
