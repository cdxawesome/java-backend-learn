package java进阶.demo04线程之间的通信;

public class ChiHuo extends Thread
{
    private BaoZi bz;

    public ChiHuo(BaoZi bz)
    {
        this.bz = bz;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (bz)
            {
                // 如果当前没有包子，则等待
                if (!bz.flag)
                {
                    try
                    {
                        bz.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                // 被唤醒之后，执行以下代码
                System.out.println("吃货正在吃:" + bz.pi + bz.xian + "包子");
                bz.flag = false;

                // 唤醒包子铺线程
                bz.notify();
                System.out.println("吃货已经把:" + bz.pi + bz.xian + "的包子吃完了，包子铺开始生产包子");
                System.out.println("------------------------------------------------------------");
            }
        }
    }
}
