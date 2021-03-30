package java进阶.demo02Exception;

public class Demo0201Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
//        int[] a = null;
        try
        {
            int element = getElement(a, 3);
            System.out.println(element);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }

    public static int getElement(int[] array, int index)
    {
        if (array == null)
            throw new NullPointerException("空指针异常");
        if (index > array.length - 1 || index < 0)
            throw new ArrayIndexOutOfBoundsException("数组访问越界");

        return array[index];
    }
}
