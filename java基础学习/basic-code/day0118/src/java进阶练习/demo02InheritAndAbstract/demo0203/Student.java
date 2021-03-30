package java进阶练习.demo02InheritAndAbstract.demo0203;

public class Student extends Person
{
    private int score;

    public Student()
    {
    }

    public Student(String name, int age, int score)
    {
        super(name, age);
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void exam()
    {
        System.out.println(getName() + "考试得了:" + score + "分");
    }
}
