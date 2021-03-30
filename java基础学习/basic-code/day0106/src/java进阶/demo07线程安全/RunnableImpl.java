package java进阶.demo07线程安全;

public class RunnableImpl implements Runnable
{
    private int numbers = 100;
    Object obj = new Object();

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (obj)
            {
                try
                {
                    Thread.sleep(10);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                if (numbers > 0)
                {
                    System.out.println(Thread.currentThread().getName() + "---" + numbers);
                    numbers--;
                }
            }
        }
    }
}
