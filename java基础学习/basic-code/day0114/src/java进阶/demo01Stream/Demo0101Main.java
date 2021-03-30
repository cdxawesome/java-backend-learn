package java进阶.demo01Stream;

import java.util.ArrayList;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("张无忌", 19));
        persons.add(new Person("赵敏", 20));
        persons.add(new Person("周芷若", 18));
        persons.add(new Person("张三丰", 100));

        persons.stream().filter((person) -> person.getName().startsWith("张"))
                .filter(person -> person.getName().length() == 3)
                .forEach(person -> System.out.println(person));
    }
}
