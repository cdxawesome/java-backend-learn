package java进阶.demo05Runnable;

public class Demo0501Main
{
    public static void main(String[] args)
    {
        RunnableImpl ri=new RunnableImpl();
        new Thread(ri).start();

    }
}
