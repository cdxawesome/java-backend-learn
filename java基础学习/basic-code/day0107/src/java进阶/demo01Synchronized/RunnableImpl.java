package java进阶.demo01Synchronized;

public class RunnableImpl implements Runnable
{
    private static int tickets = 100;

    @Override
    public void run()
    {
        while (true)
        {
            sell();
        }


    }

    private static /*synchronized*/ void sell()
    {
        synchronized (RunnableImpl.class)
        {
            if (tickets > 0)
            {
                try
                {
                    Thread.sleep(10);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---" + tickets);
                tickets--;
            }
        }

    }
}
