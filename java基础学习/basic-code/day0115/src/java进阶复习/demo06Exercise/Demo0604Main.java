package java进阶复习.demo06Exercise;

/*键盘录入一个srcStr字符串，再录入一个delStr字符串。
  删除该字srcStr符串中的所有delStr字符串。*/

import java.util.Scanner;

public class Demo0604Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入源字符串:");
        String srcStr = sc.nextLine();
        System.out.println("请输入要删除的子字符串:");
        String delStr = sc.nextLine();
        deleteSubStr(srcStr, delStr);
    }

    public static void deleteSubStr(String srcStr, String delStr)
    {
        String replace = srcStr.replace(delStr, "");
        int count = (srcStr.length() - replace.length()) / delStr.length();
        System.out.println("源字符串中共有" + count + "个" + delStr + ",删除后，剩下的字符串是" + replace);
    }
}
