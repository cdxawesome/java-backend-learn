package java进阶.demo03方法引用;

public class Demo0304Main extends Human
{
    public void method(Greet g)
    {
        g.greet();
    }

    public void show()
    {
        /*使用父类的成员方法来执行函数式接口的方法*/

        // 普通的Lambda写法
        method(()->{
            super.sayHello();
        });

        // 使用父类的方法引用
        method(super::sayHello);
    }

    public static void main(String[] args)
    {
        new Demo0304Main().show();
    }
}
