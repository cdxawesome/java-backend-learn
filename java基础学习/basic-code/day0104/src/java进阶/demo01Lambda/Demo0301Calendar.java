package java进阶.demo01Lambda;

import java.util.Calendar;

public class Demo0301Calendar
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();

        // 获取年份
        System.out.println( c.get(Calendar.YEAR));
        System.out.println( c.get(Calendar.MONTH));
        System.out.println( c.get(Calendar.WEEK_OF_MONTH));
        System.out.println( c.get(Calendar.DAY_OF_MONTH));

        System.out.println( c.get(Calendar.DATE));
    }
}
