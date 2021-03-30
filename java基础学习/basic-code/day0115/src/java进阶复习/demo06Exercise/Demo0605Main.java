package java进阶复习.demo06Exercise;

/*生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题*/

import java.util.Random;

public class Demo0605Main
{
    public static void main(String[] args)
    {
//        Random r = new Random();
//        double v = r.nextDouble() * 100;
//        System.out.println(v);
//        int indexOfDot = String.valueOf(v).indexOf(".");
//        String intValue = String.valueOf(v).substring(0, indexOfDot);
//        System.out.println(intValue);
//
//        Random r2 = new Random();
//        double v2 = r2.nextDouble() * 100;
//        System.out.println(v2);
//        indexOfDot = String.valueOf(v2).indexOf(".");
//        String doubleValue = String.valueOf(v2).substring(0, indexOfDot);
//
//        String result = intValue + "." + doubleValue;
//        System.out.println(result);

        // 上面的方法非常的Stupid (•́へ•́╬)

        double random = Math.random() * 100;
        String s = String.valueOf(random);
        int indexOfDot = s.indexOf(".");
        String result = s.substring(0, indexOfDot + 3);
        System.out.println(result);
    }
}
