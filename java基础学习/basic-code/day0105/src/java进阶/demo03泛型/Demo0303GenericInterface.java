package java进阶.demo03泛型;

public class Demo0303GenericInterface
{
    public static void main(String[] args)
    {
        GenericInterfaceImpl gII = new GenericInterfaceImpl();
        gII.print("Hello World");

        GenericInterfaceImpl2<Double> gII2 = new GenericInterfaceImpl2();
        gII2.print(3.312);
    }
}
