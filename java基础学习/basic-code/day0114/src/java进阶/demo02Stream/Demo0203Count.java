package java进阶.demo02Stream;

import java.util.Arrays;

public class Demo0203Count
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        long count = Arrays.stream(arr).count();
        System.out.println(count);
    }
}
