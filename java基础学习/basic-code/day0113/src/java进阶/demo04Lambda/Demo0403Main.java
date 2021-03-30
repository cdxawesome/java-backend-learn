package java进阶.demo04Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo0403Main
{
    public static void main(String[] args)
    {
        String[] arr = {"a", "bbb", "ccccc", "dddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));
    }

    public static Comparator<String> getComparator()
    {
        // 使用了简化的Lambda表达式,因为Comparator接口是函数式接口
        return (o1, o2) -> o2.length() - o1.length();
    }
}
