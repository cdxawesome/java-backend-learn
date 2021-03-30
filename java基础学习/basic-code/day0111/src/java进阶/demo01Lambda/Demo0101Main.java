package java进阶.demo01Lambda;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        invokeCook(()->{
            System.out.println("吃饭了!");
        });
    }

    public static void invokeCook(Cook cook)
    {
        cook.makeFood();
    }
}
