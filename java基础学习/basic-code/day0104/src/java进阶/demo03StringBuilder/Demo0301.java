package java进阶.demo03StringBuilder;

public class Demo0301
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("ef");
        String s = stringBuilder.toString();
        System.out.println(stringBuilder);
        System.out.println(s);
    }
}
