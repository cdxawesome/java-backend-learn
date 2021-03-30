package JavaWeb.reflect.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo0301ReflectDemo
{
    public static void main(String[] args) throws Exception
    {
        // 加载配置文件

        // 获取类加载器
        ClassLoader classLoader = Demo0301ReflectDemo.class.getClassLoader();
        // 通过类加载器获取到配置文件的文件流
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        // 通过Properties集合获取配置文件的内容
        Properties properties = new Properties();
        properties.load(is);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 加载该类进入内存中
        Class<?> cls = Class.forName(className);
        Constructor<?> constructor = cls.getConstructor();
        Method method = cls.getMethod(methodName);
        method.invoke(constructor.newInstance());
    }
}
