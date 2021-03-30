package java进阶.demo06HashSet;

import java.util.HashSet;

public class Demo06Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("小明", 27);
        Person p2 = new Person("小明", 27);
        Person p3 = new Person("小明", 28);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);
    }
}
