package java进阶.demo02Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo0206Main
{
    public static void main(String[] args)
    {
        /*问题：
        已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合*/
        String[] arr1 = {"郭靖", "杨康"};
        String[] arr2 = {"黄蓉", "穆念慈"};
        List<String> names = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).collect(Collectors.toList());
        System.out.println(names);
    }
}
