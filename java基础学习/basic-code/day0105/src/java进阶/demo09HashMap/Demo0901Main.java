package java进阶.demo09HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo0901Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 168);
        map.put("李四", 165);
        map.put("王五", 170);
        map.put("宋小宝", 150);

        System.out.println(map);

        Set<String> set = map.keySet();
        // 用迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext())
            System.out.println(map.get(it.next()));

        System.out.println("------------------------------");
        // 用增强for循环遍历
        for (String s : set)
        {
            System.out.println(map.get(s));
        }
    }
}
