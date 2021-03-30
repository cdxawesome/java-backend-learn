package java进阶.demo01Lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo0201
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd:");
        String birthDay = sc.next();
        birthDayCount(birthDay);
    }

    private static void birthDayCount(String birthDay) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthDay);
        long birthTime = date.getTime();
        long currentTime = new Date().getTime();
        long birthCount = currentTime - birthTime;
        System.out.println(birthCount/1000/60/60/24);
    }
}
