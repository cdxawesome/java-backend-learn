package java进阶.demo06;

public class Demo0601Main
{
    public static void main(String[] args)
    {
        // 使用Thread类
        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Thread的匿名内部类---" + i);
                }
            }
        }.start();

        // 使用Runnable接口
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Runnable接口的匿名内部类----" + i);
                }
            }
        }).start();
    }
}
