package java进阶.demo04线程之间的通信;

public class BaoZiPu extends Thread
{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz)
    {
        this.bz = bz;
    }

    @Override
    public void run()
    {
        int count = 0;
        while(true)
        {
            synchronized (bz)
            {
                // 如果现在有包子，那么包子铺就等待
                if (bz.flag)
                {
                    try
                    {
                        bz.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                // 包子铺唤醒之后，执行以下代码，开始做包子
                if (count % 2 == 0)
                {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }
                else
                {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产:" + bz.pi + bz.xian + "包子");
                try
                {
                    Thread.sleep(3000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                bz.flag = true;
                // 包子已经做好了，通知另一个线程
                bz.notify();
                System.out.println("包子铺已经生产好了：" + bz.pi + bz.xian+"包子，吃货可以开始吃了");
            }
        }

    }
}
