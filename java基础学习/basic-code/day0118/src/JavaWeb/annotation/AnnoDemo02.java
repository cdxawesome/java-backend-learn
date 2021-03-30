package JavaWeb.annotation;

import java.lang.reflect.Method;

@Pro(className = "JavaWeb.annotation.DoSomething", methodName = "show")
@SuppressWarnings("all")
public class AnnoDemo02
{
    public static void main(String[] args) throws Exception
    {
        // 获取Class对象
        Class<AnnoDemo02> cls = AnnoDemo02.class;
        // 获取注解对象
        Pro annotation = cls.getAnnotation(Pro.class);
        // 获取注解中的内容
        String className = annotation.className();
        String methodName = annotation.methodName();

        // 加载该类到内存中
        Class<?> aClass = Class.forName(className);
        // 获取方法
        Method method = aClass.getMethod(methodName);
        // 执行方法
        method.invoke(aClass.newInstance());
    }
}
