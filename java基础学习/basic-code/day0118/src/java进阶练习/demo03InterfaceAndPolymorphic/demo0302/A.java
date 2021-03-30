package java进阶练习.demo03InterfaceAndPolymorphic.demo0302;

public interface A
{
    public abstract void showA();

    private void show10(String str)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print(" " + str);
        }
        System.out.println();
    }

    default void showB10(String str)
    {
        show10(str);
    }
    default void showC10(String str)
    {
        show10(str);
    }
}
