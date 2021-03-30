package java进阶复习.demo01Collection;

/*六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。*/

import java.util.HashSet;

public class Demo0108Main
{
    public static void main(String[] args)
    {
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("迪丽热巴",18));
        personHashSet.add(new Person("迪丽热巴",18));
        personHashSet.add(new Person("古力娜扎",20));
        personHashSet.add(new Person("马尔扎哈",21));

        for (Person person : personHashSet)
        {
            System.out.println(person);
        }
    }
}
