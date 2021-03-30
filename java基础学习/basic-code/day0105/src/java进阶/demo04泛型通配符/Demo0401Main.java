package java进阶.demo04泛型通配符;

import java.util.ArrayList;

public class Demo0401Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(1);
        arrayInt.add(2);
        arrayInt.add(3);

        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("a");
        arrayStr.add("b");
        arrayStr.add("c");

        printArray(arrayInt);
        printArray(arrayStr);
    }

    public static void printArray(ArrayList<?> arrayList)
    {
        System.out.println(arrayList);
    }
}
