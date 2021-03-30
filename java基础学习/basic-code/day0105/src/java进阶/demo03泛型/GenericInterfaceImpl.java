package java进阶.demo03泛型;

public class GenericInterfaceImpl implements GenericInterface<String>
{
    @Override
    public void print(String value)
    {
        System.out.println(value);
    }
}
