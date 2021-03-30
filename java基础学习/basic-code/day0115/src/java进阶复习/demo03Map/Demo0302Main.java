package java进阶复习.demo03Map;

/*往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo0302Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "西施");
        map.put(2, "貂蝉");
        map.put(3, "王昭君");
        map.put(4, "杨玉环");

        Collection<String> values = map.values();
        for (String value : values)
        {
            System.out.println(value);
        }
    }
}
