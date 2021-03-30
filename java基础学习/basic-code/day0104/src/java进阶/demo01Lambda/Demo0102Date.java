package java进阶.demo01Lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo0102Date
{
    public static void main(String[] args) throws ParseException
    {
//        date01();
        date02();
    }

    private static void date02() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2021年01月04日 13时18分51秒");
        System.out.println(date);
    }

    private static void date01()
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date=new Date();
        String format = sdf.format(date);
        String format1 = sdf1.format(date);

        System.out.println(date);
        System.out.println(format);
        System.out.println(format1);
    }
}
