package java进阶复习.demo03Map;

/*五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo0303Main
{
    public static void main(String[] args)
    {
        Map<Car, Integer> carMall = new HashMap<>();
        carMall.put(new Car("玛莎拉蒂", "红色"), 100000);
        carMall.put(new Car("阿尔法罗密欧", "棕色"), 200000);
        carMall.put(new Car("梅赛德斯奔驰", "黑色"), 1000000);
        carMall.put(new Car("BMW", "白色"), 8000000);
        carMall.put(new Car("柯尼塞格", "彩色"), 12000000);
        carMall.put(new Car("保时捷911", "蓝色"), 2200000);

        Set<Car> carsKeySet = carMall.keySet();
        for (Car car : carsKeySet)
        {
            System.out.println("key:" + car + ",value:" + carMall.get(car));
        }

        Set<Map.Entry<Car, Integer>> entries = carMall.entrySet();
        for (Map.Entry<Car, Integer> entry : entries)
        {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }
}
