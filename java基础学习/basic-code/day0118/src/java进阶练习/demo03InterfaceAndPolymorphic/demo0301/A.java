package java进阶练习.demo03InterfaceAndPolymorphic.demo0301;

public interface A
{
    public abstract void showA();
    default void showB()
    {
        System.out.println("BBBB");
    }
}
