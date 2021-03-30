package JavaWeb.reflect.demo02;

import java.lang.reflect.Method;

public class DEmo0203Main
{
    public static void main(String[] args) throws Exception
    {
        // 获取Class对象的成员方法
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods)
        {
            System.out.println(method.getName());
        }

        System.out.println("-----------------------------");
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "面条");
    }
}
