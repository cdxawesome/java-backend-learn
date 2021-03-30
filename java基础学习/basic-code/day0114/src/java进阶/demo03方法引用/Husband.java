package java进阶.demo03方法引用;

public class Husband
{
    public void buyHouse()
    {
        System.out.println("买一套房");
    }

    public void marry(IRich rich)
    {
        rich.buy();
    }

    public void happy()
    {
        // 使用本类的方法引用

        // 普通的Lambda写法
        marry(()->this.buyHouse());

        // 使用方法引用
        marry(this::buyHouse);
    }

    public static void main(String[] args)
    {
        new Husband().happy();
    }
}
