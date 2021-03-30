package java进阶复习.demo04Date;

/*请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo0401Main
{
    public static void main(String[] args)
    {
        Date date = new Date();
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now = sfd.format(date);
        System.out.println(now);
    }
}
