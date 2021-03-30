package JavaWeb.reflect.demo02;

import java.lang.reflect.Constructor;

public class Demo0202Main
{
    public static void main(String[] args) throws Exception
    {
        // 获取Class文件的构造方法
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors)
        {
            System.out.println(constructor);
        }

        System.out.println("-------------------------------");

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Person person = constructor.newInstance("张三", 28);
        System.out.println(person);
    }
}
