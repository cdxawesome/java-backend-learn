package java进阶.demo03方法引用;

public class Demo0302Main
{
    public static void func(MyFunctionalInterface mif)
    {
        mif.printString("Hello");
    }

    public static void main(String[] args)
    {
        /*原本的Lambda表达式,使用函数式接口来执行想要的功能,但是功能的实现方式是自己在Lambda里面去定义
        * 方法引用相当于,在Lambda表达式里面,使用另一个类的方法来执行我想要的操作.使用这个方法引用的前提是:
        * 该类是已知的,类里面的那个方法也是已知的*/

        // 使用方法引用的写法
        MyRefClass mr = new MyRefClass();
        func(mr::printToUpperCase);

        // 使用Lambda表达式的写法
        func((String str) ->
        {
            MyRefClass mr2 = new MyRefClass();
            mr2.printToUpperCase(str);
        });
    }
}
