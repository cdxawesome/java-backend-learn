package java进阶.demo06Lambda;

public class Demo0601Main
{
    public static void main(String[] args)
    {
        new Thread(() ->
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程")).start();
    }
}
