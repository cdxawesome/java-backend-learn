package java进阶复习.demo06Exercise;

/*键盘录入一个大字符串，再录入一个小字符串。
统计小字符串在大字符串中出现的次数。*/

import java.util.Scanner;

public class Demo0603Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串:");
        String big = sc.nextLine();
        System.out.println("请输入小字符串:");
        String small = sc.nextLine();
        System.out.println(small + "在大字符串中出现的次数是" + countStr(big, small));
    }

    public static int countStr(String big, String small)
    {
        int index = 0;
        int count = 0;
        // 找到子字符串的位置，然后index往后移一位，继续向后找
        while ((index = big.indexOf(small, index)) != -1)
        {
            index++;
            count++;
        }
        return count;
    }
}
