package cn.itcast.day04.demo08字符串;

import java.util.Scanner;

public class Demo0803
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringCount(sc.next());
    }

    public static void StringCount(String str)
    {
        char[] strArray = str.toCharArray();
        int upper, lower, number, other;
        upper = lower = number = other = 0;
        for (int i = 0; i < strArray.length; i++)
        {
            if (Character.isDigit(strArray[i]))
                number++;
            else if (Character.isLowerCase(strArray[i]))
                lower++;
            else if (Character.isUpperCase(strArray[i]))
                upper++;
            else
                other++;
        }
        System.out.println("大写字母有:" + upper + "个,小写字母有:"
                + lower + "个，数字有:" + number + "个，其他的有:" + other + "个.");
    }
}
