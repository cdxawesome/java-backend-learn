package java进阶.demo02Exception;

import java.util.Arrays;

public class Demo0202System
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.arraycopy(a, 0, b, 0, 3);
        System.out.println(Arrays.toString(b));
    }
}
