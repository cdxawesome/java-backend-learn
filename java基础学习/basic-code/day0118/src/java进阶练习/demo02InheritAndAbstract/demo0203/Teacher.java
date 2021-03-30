package java进阶练习.demo02InheritAndAbstract.demo0203;

public class Teacher extends Person
{
    private String subject;

    public Teacher()
    {
    }

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public void methodOfLectures()
    {
        System.out.println(getName() + "讲授" + subject + "课");
    }
}
