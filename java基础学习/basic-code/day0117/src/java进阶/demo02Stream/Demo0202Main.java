package java进阶.demo02Stream;

import java.util.*;
import java.util.function.Function;

public class Demo0202Main
{
    public static void main(String[] args)
    {
        // a)求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer>, Integer> f1 = (list) ->
        {
            int sum = 0;
            for (Integer integer : list)
            {
                sum += integer;
            }
            return sum / list.size();
        };

        // b)将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String, Integer>, ArrayList<Integer>> f2 = (map) ->
        {
            Collection<Integer> values = map.values();
            return new ArrayList<>(values);
        };

        /*2.已知学生成绩如下
        姓名	    成绩
        岑小村	59
        谷天洛	82
        渣渣辉	98
        蓝小月	65
        皮几万	70
        以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
        * */
        Map<String, Integer> score = new HashMap<>();
        score.put("岑小村",59);
        score.put("谷天洛",82);
        score.put("渣渣辉",98);
        score.put("蓝小月",65);
        score.put("皮几万",70);

        Integer result = f2.andThen(f1).apply(score);
        System.out.println(result);

    }
}
