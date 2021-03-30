package java进阶.demo02Stream;

import java.util.ArrayList;

public class Demo0207Main
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add("Hello - " + i);
        }
        //这是只有一个流在做打印输出的操作
        list.stream().forEach(System.out::println);
        System.out.println("-------------------");

        //获取一个并发流
        list.parallelStream().forEach(System.out::println);

        //普通流调用变成并发流
        list.stream().parallel().forEach(System.out::println);
    }
}
