package java基础.demo02;

import java.util.Arrays;

public class Demo01Arrays
{
    public static void main(String[] args)
    {
        int[] array1 = {5, 7, 2, 9, 1, 8, 5, 22, 0, 23};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        for (int i = array1.length - 1; i >= 0; i--)
        {
            System.out.print(array1[i]+", ");
        }
    }
}
