package java进阶复习.demo04Date;

/*使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo0402Main
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2018-03-04");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String dateStr = sdf2.format(date);

        System.out.println(dateStr);
    }
}
