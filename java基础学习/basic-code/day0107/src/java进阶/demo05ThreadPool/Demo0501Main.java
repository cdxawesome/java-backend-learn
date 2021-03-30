package java进阶.demo05ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo0501Main
{
    public static void main(String[] args)
    {
        // 创建一个有两个线程的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        // 不建议用shutdown
        es.shutdown();
    }
}
