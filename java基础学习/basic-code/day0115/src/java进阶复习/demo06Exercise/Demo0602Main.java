package java进阶复习.demo06Exercise;

/*  键盘录入QQ号码，验证格式的正确性。
*   必须是5—12位数字。
    0不能开头*/

import java.util.Scanner;

public class Demo0602Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean b = checkQQNumbers(input);
        System.out.println("这个QQ号是否正确:" + b);
    }

    public static boolean checkQQNumbers(String qq)
    {
        char[] chars = qq.toCharArray();
        if (chars[0] == '0')
        {
            System.out.println("QQ号不能以0开头");
            return false;
        }

        for (char a : chars)
        {
            if (!Character.isDigit(a))
            {
                System.out.println("QQ号必须是数字");
                return false;
            }
        }

        if (qq.length() < 5 || qq.length() > 12)
        {
            System.out.println("QQ号长度必须是5-12为数字");
            return false;
        }

        return true;
    }
}
