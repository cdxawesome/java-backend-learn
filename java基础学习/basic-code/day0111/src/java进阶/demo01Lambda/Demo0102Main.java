package java进阶.demo01Lambda;

import java.util.Arrays;

public class Demo0102Main
{
    public static void main(String[] args)
    {
        Person[] people = {
                new Person("张三", 16),
                new Person("李四", 12),
                new Person("王五", 20)
        };

        Arrays.sort(people, (Person a, Person b) ->
        {
            return a.getAge() - b.getAge();
        });

        for (Person person : people)
        {
            System.out.println(person);
        }
    }
}
