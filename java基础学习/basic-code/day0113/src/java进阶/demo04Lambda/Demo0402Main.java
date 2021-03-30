package java进阶.demo04Lambda;

public class Demo0402Main
{
    public static void startThread(Runnable run)
    {
        new Thread(run).start();
    }

    public static void main(String[] args)
    {
        // 使用接口的实现类
        startThread(new Demo0402Runnable());

        // 使用接口的匿名内部类
        startThread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName() + "---启动了");
            }
        });

        // 使用Lambda表达式
        startThread(() ->
        {
            System.out.println(Thread.currentThread().getName() + "---启动了");
        });

        // 使用简化的Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "---启动了"));
    }
}
