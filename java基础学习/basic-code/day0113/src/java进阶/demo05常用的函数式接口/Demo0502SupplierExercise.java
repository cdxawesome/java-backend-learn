package java进阶.demo05常用的函数式接口;

import java.util.function.Supplier;

public class Demo0502SupplierExercise
{
    public static int getMax(Supplier<Integer> sup)
    {
        return sup.get();
    }

    public static void main(String[] args)
    {
        int[] arr = {20, 50, 900, -10, -100, 199};
        int maxValue = getMax(() ->
        {
            int max = arr[0];
            for (int i : arr)
            {
                if (i > max)
                    max = i;
            }
            return max;
        });

        System.out.println(maxValue);
    }
}
