package cn.itcast.day04.demo06Random的使用;

import java.util.Random;
import java.util.Scanner;

public class Demo0602
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("猜数字游戏：我将随机生成一个100以内的正整数，你来猜!");
        System.out.println("游戏开始!");
        System.out.println("=============================================");
        int number = r.nextInt(101);
        int input;
        while (true)
        {
            System.out.print("请输入您猜的数字:");
            input = sc.nextInt();
            if (input > number)
            {
                System.out.println("猜的数字大了");
            }
            else if(input<number)
            {
                System.out.println("猜的数字小了");
            }
            else
            {
                System.out.println("您猜对了!");
                break;
            }
        }


    }
}
