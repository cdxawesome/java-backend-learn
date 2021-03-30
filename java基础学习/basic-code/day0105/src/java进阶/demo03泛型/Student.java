package java进阶.demo03泛型;

public class Student<T>
{
    private T name;

    public T getName()
    {
        return name;
    }

    public void setName(T name)
    {
        this.name = name;
    }
}
