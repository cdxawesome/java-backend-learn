package cn.itcast.day04.demo08字符串;

public class Demo0801
{
    public static void main(String[] args)
    {
        String str1 = "hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1==str3);
    }
}
