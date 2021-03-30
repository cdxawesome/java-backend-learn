package java进阶练习.demo02InheritAndAbstract.demo0202;

import java进阶练习.demo02InheritAndAbstract.demo0202.Duck;

public class Demo0202Main
{
    public static void main(String[] args)
    {
        Duck d = new Duck("鸭子", "发烧", 2, "感冒");
        d.showMsg();
        d.showSymptom();
    }
}
