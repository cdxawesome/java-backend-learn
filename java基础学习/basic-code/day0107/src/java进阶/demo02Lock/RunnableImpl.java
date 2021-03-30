package java进阶.demo02Lock;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable
{
    private static int tickets = 100;
    ReentrantLock l = new ReentrantLock();

    @Override
    public void run()
    {
        while (true)
        {
            l.lock();
            if (tickets > 0)
            {
                try
                {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "---" + tickets);
                    tickets--;
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    l.unlock();
                }
            }
        }
    }
}
