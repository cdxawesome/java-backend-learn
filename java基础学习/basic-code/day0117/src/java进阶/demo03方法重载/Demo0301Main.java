package java进阶.demo03方法重载;

/*定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
main方法中,调用printNum方法,传入a,b
main方法中,调用doubling方法,传入a,b
main方法中,调用printNum方法,传入a,b
main方法中,调用doubling方法,传入a,用a接收返回值
main方法中,调用doubling方法,传入b,用b接收返回值
main方法中,调用printNum方法,传入a,b*/

public class Demo0301Main
{
    public static void main(String[] args)
    {
        int a = 10, b = 10;
        // main方法中,调用printNum方法,传入a,b
        printNum(a, b);
        // main方法中,调用doubling方法,传入a,b
        doubling(a, b);
        // main方法中,调用printNum方法,传入a,b
        printNum(a, b);
        // main方法中,调用doubling方法,传入a,用a接收返回值
        a = doubling(a);
        // main方法中,调用doubling方法,传入b,用b接收返回值
        b = doubling(b);
        // main方法中,调用printNum方法,传入a,b
        printNum(a, b);
    }

    private static void printNum(int iVar, int iVar2)
    {
        System.out.println(iVar + "|" + iVar2);
    }

    //定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
    private static void doubling(int r, int p)
    {
        printNum(2 * r, 2 * p);
    }

    // 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
    private static int doubling(int r)
    {
        return 2 * r;
    }
}
