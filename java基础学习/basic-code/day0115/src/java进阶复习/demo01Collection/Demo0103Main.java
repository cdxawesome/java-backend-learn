package java进阶复习.demo01Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo0103Main
{
    public static void main(String[] args)
    {
        /*传入一个集合，将集合转换成具有相同元素的数组，并输出在控制台中*/
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        Object[] objects = list.toArray();
        for (Object o : objects)
        {
            System.out.println(o);
        }
    }
}
