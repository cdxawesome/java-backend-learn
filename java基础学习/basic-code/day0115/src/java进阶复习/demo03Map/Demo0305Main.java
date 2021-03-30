package java进阶复习.demo03Map;

/*有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。*/

import java.util.HashMap;
import java.util.Map;

public class Demo0305Main
{
    public static void main(String[] args)
    {
        String[] province = {"黑龙江", "浙江省", "江西省", "广东省", "福建省"};
        String[] provincialCapital = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        Map<String, String> provinceMap = new HashMap<>();

        for (int i = 0; i < province.length; i++)
        {
            provinceMap.put(province[i], provincialCapital[i]);
        }

        System.out.println(provinceMap);
    }
}
