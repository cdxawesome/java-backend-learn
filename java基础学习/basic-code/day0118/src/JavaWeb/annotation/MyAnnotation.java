package JavaWeb.annotation;

public @interface MyAnnotation
{
    // 基本类型
    int age();

    // String类型
    String name() default "张三";

    // 枚举类型
    Person person();

    // 注解类型
    MyAnnotation2 MyAnn();

    // 以上的数组类型
    int[] intArr();

}
