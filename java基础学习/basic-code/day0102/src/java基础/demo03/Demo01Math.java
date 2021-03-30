package java基础.demo03;

public class Demo01Math
{
    public static void main(String[] args)
    {
        double min = -10.8;
        double max = 5.9;
        int count=0;
        for (int i = (int) Math.ceil(min); i <= Math.floor(max); i++)
        {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有:"+count+"个");
    }
}
