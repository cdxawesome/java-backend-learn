package java进阶.demo04线程之间的通信;

public class Demo0401Main
{
    public static void main(String[] args)
    {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
