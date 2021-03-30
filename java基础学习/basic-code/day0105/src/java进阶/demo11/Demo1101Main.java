package java进阶.demo11;

import java.util.*;

public class Demo1101Main
{
    public static void main(String[] args)
    {
        System.out.println("请输入一个字符串，我将返回字符串中每个字符出现的次数:");
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        char[] chars = value.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char aChar : chars)
        {
            if (charCount.get(aChar) != null)
            {
                Integer count = charCount.get(aChar);
                charCount.put(aChar, ++count);
            }
            else
            {
                charCount.put(aChar, 1);
            }
        }

        System.out.println(charCount);
    }
}
