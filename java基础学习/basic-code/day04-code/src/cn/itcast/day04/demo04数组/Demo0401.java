package cn.itcast.day04.demo04数组;

public class Demo0401
{
    public static void main(String[] args)
    {
        int array[] = new int[2];
        array[0] = 1;
        array[1] = 2;

        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array3[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        showArray(array3);
    }

    public static void showArray(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
