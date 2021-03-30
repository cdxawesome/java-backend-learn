package java进阶复习.demo05Calendar;

/*用程序判断2018年2月14日是星期几*/

import java.util.Calendar;

public class Demo0501Main
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        c.set(2018, Calendar.FEBRUARY, 14);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        int day = c.get(Calendar.DATE);

        // DAY_OF_WEEK是从星期天算起的，所以最后的结果要-1
        System.out.println(year + "年" + (month + 1) + "月" + day + "日是星期" + (week - 1));
        System.out.println(c);
    }
}
