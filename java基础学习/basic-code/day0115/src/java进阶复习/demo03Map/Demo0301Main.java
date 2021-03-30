package java进阶复习.demo03Map;

/*请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作*/

import java.util.HashMap;
import java.util.Map;

public class Demo0301Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "西施");
        map.put(2, "貂蝉");
        map.put(3, "王昭君");
        map.put(4, "杨玉环");

        System.out.println(map);

        map.remove(1);

        System.out.println(map);

        System.out.println(map.get(2));
    }
}
