package cn.itcast.day04.demo02;

public class Demo02Print
{
    public static void main(String[] args)
    {
        printHelloWorld(10);
    }

    public static void printHelloWorld(int times)
    {
        int count = 0;
        while (count <= times)
        {
            System.out.println("Hello,World!");
            count++;
        }
    }
}
