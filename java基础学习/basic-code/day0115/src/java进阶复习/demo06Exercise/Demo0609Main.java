package java进阶复习.demo06Exercise;

/*必须至少8个字符。
必须至少2个大写字符。
必须只有字母和数字。*/

import java.util.Scanner;

public class Demo0609Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码:");
        String code = sc.next();
        System.out.println("密码是否合法:" + checkCode(code));
    }

    public static boolean checkCode(String code)
    {
        // 至少8个字符
        if (code.length() < 8)
            return false;

        int index = 0;
        int upperCaseCount = 0;
        char[] chars = code.toCharArray();

        for (char aChar : chars)
        {
            // 统计大写字母个数
            if (Character.isUpperCase(aChar))
                upperCaseCount++;
            // 只能是字母和数字
            if (!Character.isAlphabetic(aChar) && !Character.isDigit(aChar))
                return false;
        }
        if (upperCaseCount < 2)
            return false;

        return true;
    }
}
