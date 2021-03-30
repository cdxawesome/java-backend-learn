package java进阶复习.demo06Exercise;

/*判断回文字符串。如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。*/

public class Demo0607Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("dad"));
    }

    public static boolean isPalindrome(String str)
    {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        for (int i = startIndex, j = endIndex; i < endIndex; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
