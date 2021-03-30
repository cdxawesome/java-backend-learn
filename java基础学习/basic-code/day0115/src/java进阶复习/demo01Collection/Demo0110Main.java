package java进阶复习.demo01Collection;

/*八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo0110Main
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("王昭君");
        names.add("王昭君");
        names.add("西施");
        names.add("杨玉环");
        names.add("貂蝉");

        // 使用迭代器遍历
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());

        System.out.println();

        // 使用增强for循环遍历
        for (String name : names)
        {
            System.out.print(" " + name);
        }
    }
}
