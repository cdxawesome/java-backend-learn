package java进阶.demo05常用的函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo0510PredicateExercise
{
    /**筛选数组里名字是四个字并且是女生的元素**/
    public static ArrayList<String> filterArray(String[] arr, Predicate<String> pre1, Predicate<String> pre2)
    {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr)
        {
            if (pre1.and(pre2).test(s))
                result.add(s);
        }

        return result;
    }

    public static void main(String[] args)
    {
        String[] arr = {"古力娜扎,女", "迪丽热巴,女", "卓木强巴,男", "刘亦菲,女"};
        ArrayList<String> result = filterArray(arr,
                (str) -> str.split(",")[0].length() == 4,
                (str) -> str.split(",")[1].equals("女")
        );

        System.out.println(result);
    }
}
