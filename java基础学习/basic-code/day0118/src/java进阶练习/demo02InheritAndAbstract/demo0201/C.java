package java进阶练习.demo02InheritAndAbstract.demo0201;

public class C extends B
{
    int numc = 30;

    @Override
    public void showA()
    {
        System.out.println(super.numa);
    }

    @Override
    public void showB()
    {
        System.out.println(numb);
    }

    public void showC()
    {
        System.out.println(numc);
    }
}
