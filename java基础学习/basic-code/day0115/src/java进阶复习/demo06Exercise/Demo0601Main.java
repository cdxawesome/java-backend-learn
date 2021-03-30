package java进阶复习.demo06Exercise;

/*反转键盘录入的字符串*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo0601Main
{
    public static void main(String[] args)
    {
        System.out.println("请输入一行字符串:");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        System.out.println(reverseStrFunc01(value));
        System.out.println(reverseStrFunc02(value));
    }

    public static String reverseStrFunc01(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }

    public static String reverseStrFunc02(String str)
    {
        char[] charsSource = str.toCharArray();
        char[] charReverse = new char[charsSource.length];
        for (int i = charsSource.length - 1; i >= 0; i--)
        {
            charReverse[charsSource.length - 1 - i] = charsSource[i];
        }

        return String.valueOf(charReverse);
    }
}
