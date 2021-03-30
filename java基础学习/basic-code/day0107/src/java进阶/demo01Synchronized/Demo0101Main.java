package java进阶.demo01Synchronized;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        RunnableImpl run = new RunnableImpl();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
