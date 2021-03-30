package java基础.demo03;

public class Demo0303Print
{
    public static void main(String[] args)
    {
        printYouWant(10);
    }

    public static void printYouWant(int printTimes)
    {
        for (int i = 0; i < printTimes; i++)
        {
            System.out.println("Hello,World!");
        }
    }
}
