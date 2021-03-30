package java进阶.demo05ArrayConstructorReference;

public class Demo0501Main
{
    public static int[] createArray(int length, ArrayBuilder ab)
    {
        return ab.buildArray(length);
    }

    public static void main(String[] args)
    {
        /*使用数组的构造器引用*/

        // 普通的Lambda
        int[] array = createArray(10, (length) -> new int[length]);
        System.out.println(array.length);

        // 使用方法引用优化的Lambda
        int[] array1 = createArray(20, int[]::new);
        System.out.println(array1.length);
    }
}
