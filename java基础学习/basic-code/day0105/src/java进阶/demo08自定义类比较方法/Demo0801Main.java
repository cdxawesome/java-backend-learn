package java进阶.demo08自定义类比较方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo0801Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("张三", 27);
        Person p2 = new Person("b李四", 26);
        Person p3 = new Person("王五", 28);
        Person p4 = new Person("a李四", 26);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // 自定义类里面已经实现了Comparable接口
        Collections.sort(persons);
        System.out.println(persons);

        // 使用匿名内部类(Comparator)
        persons.sort(new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                int result = o1.getAge() - o2.getAge();
                if (result == 0)
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                return result;
            }
        });

        System.out.println(persons);
    }
}
