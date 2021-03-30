package java进阶.demo05常用的函数式接口;

import java.util.function.Consumer;

public class Demo0505ConsumerExercise
{
    public static void formatString(String[] arr, Consumer<String> con1, Consumer<String> con2)
    {
        for (String s : arr)
        {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args)
    {
        String[] arr = {"Dylan,18", "Susan,20", "Jack,30"};
        formatString(arr,
                (str) -> System.out.print("姓名:" + str.split(",")[0]),
                (str) -> System.out.println("," + "年龄" + str.split(",")[1] + "。")
        );
    }
}
