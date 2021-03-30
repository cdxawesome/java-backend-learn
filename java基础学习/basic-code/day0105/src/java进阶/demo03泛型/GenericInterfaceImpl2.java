package java进阶.demo03泛型;

public class GenericInterfaceImpl2<T> implements GenericInterface<T>
{
    @Override
    public void print(T value)
    {
        System.out.println(value);
    }
}

