package java进阶.demo03WaitAndNotify;

public class Demo0301Main
{
    public static void main(String[] args)
    {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run()
            {
                synchronized (obj)
                {
                    System.out.println("老板我要包子");
                    try
                    {
                        obj.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("拿到包子了，开吃!");
                }

            }
        }.start();

        new Thread(){
            @Override
            public void run()
            {
                synchronized (obj)
                {
                    System.out.println("好的，稍等，我开始做包子，做好了叫你");
                    try
                    {
                        Thread.sleep(5000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了");
                    obj.notify();
                }
            }
        }.start();
    }
}
