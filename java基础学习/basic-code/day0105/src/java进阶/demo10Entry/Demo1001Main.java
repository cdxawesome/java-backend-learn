package java进阶.demo10Entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1001Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("小明",180);
        map.put("小李",170);
        map.put("小红",160);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries)
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
