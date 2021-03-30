package java进阶.demo02Stream;

import java.util.ArrayList;

public class Demo0204Main
{
    public static void main(String[] args)
    {
        /*问题：
        已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
        1、取出前2个元素并在控制台打印输出。
        2、取出后2个元素并在控制台打印输出
        * */

        ArrayList<String> names = new ArrayList<>();
        names.add("陈玄风");
        names.add("梅超风");
        names.add("陆乘风");
        names.add("曲灵风");
        names.add("武眠风");
        names.add("冯默风");
        names.add("罗玉风");

        names.stream().limit(2).forEach(System.out::println);
        System.out.println("---------------------------");
        names.stream().skip(names.size()-2).forEach(System.out::println);
    }
}
