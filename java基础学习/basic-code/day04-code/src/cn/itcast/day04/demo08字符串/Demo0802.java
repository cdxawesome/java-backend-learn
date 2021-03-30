package cn.itcast.day04.demo08字符串;

public class Demo0802
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(JointString(a));
    }

    public static String JointString(int[] a)
    {
//        String originalString = a.toString();

//        char[] originalChar = originalString.toCharArray();
        String result = "[";
        for (int i = 0; i < a.length; i++)
        {
            if (i != a.length - 1)
            {
                result += "word" + a[i] + "#";
            }
            else
            {
                result += "word" + a[i];
            }

        }
        result += "]";
        return result;
    }
}
