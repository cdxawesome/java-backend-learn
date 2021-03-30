package java进阶练习.demo02InheritAndAbstract.demo0203;

public class Demo0203Main
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("王老师", 39, "Java");
        Student student = new Student("李小乐", 20, 90);
        teacher.methodOfLectures();
        student.exam();
    }
}
