package java进阶.demo04Thread;

public class Demo0401Main
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 20; i++)
//        {
//            System.out.println("main:" + i);
//        }
    }
}
