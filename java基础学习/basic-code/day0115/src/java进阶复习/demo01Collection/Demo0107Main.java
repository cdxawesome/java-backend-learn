package java进阶复习.demo01Collection;

/*五、根据要求练习LinkedList方法：
（1）基本方法：add, set, get, remove, clear, size等方法；
（2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst, removeLast, push, pop, clear等方法。*/

import java.util.LinkedList;

public class Demo0107Main
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("张三");
        linkedList.add("张三");
        linkedList.add("张三");
        linkedList.add("张三");

        linkedList.add(3, "李四");

        linkedList.set(0, "赵大");
        String s = linkedList.get(3);
        System.out.println(s);

        String first = linkedList.getFirst();
        System.out.println(first);
        String last = linkedList.getLast();
        System.out.println(last);

        linkedList.remove();

    }
}
