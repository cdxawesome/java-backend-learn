package java进阶.demo04Lambda;

public class Demo0402Runnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"---启动了");
    }
}
