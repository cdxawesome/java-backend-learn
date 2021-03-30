package JavaWeb.reflect.demo02;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class Demo0201Main
{
    public static void main(String[] args) throws Exception
    {
        Class<Person> personClass = Person.class;

        // 获取类的属性
        Field[] fields = personClass.getFields();
        for (Field field : fields)
        {
            System.out.println(field);
        }
        Field a = personClass.getField("a");
        Person p = new Person();
        a.set(p, "AAA");
        System.out.println(p);

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields)
        {
            System.out.println(declaredField);
        }

        Field name = personClass.getDeclaredField("name");
        // 忽略访问修饰符的权限检查
        name.setAccessible(true);
        name.set(p,"张三");
        System.out.println(p);
    }
}
