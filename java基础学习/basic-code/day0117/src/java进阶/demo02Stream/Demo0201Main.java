package java进阶.demo02Stream;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo0201Main
{
    public static void main(String[] args)
    {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};

        // a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
//        Arrays.stream(arr).filter((value)->value>=0).forEach(System.out::println);
        Predicate<Integer> p1 = (value) -> value >= 0;

        // b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        Predicate<Integer> p2 = (value) -> Math.abs(value) > 100;

        // c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Predicate<Integer> p3 = (value) -> value % 2 == 0;

        /*
        * 遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
            i.打印自然数的个数
            ii.打印负整数的个数
            iii.打印绝对值大于100的偶数的个数
            iv.打印是负整数或偶数的数的个数*/
        int naturalNumberCounter = 0;
        int negativeIntegerCounter = 0;
        int absEvenCounter = 0;
        int negativeEvenInteger = 0;
        for (Integer integer : arr)
        {
            if (p1.test(integer))
                naturalNumberCounter++;
            else
                negativeIntegerCounter++;
            if (p2.and(p3).test(integer))
                absEvenCounter++;
            if (!p1.test(integer) && p3.test(integer))
                negativeEvenInteger++;
        }

        System.out.println("自然数的个数:"+naturalNumberCounter);
        System.out.println("负整数的个数:"+negativeIntegerCounter);
        System.out.println("绝对值大于100的偶数的个数:"+absEvenCounter);
        System.out.println("负整数的偶数的数的个数:"+negativeEvenInteger);

    }
}
