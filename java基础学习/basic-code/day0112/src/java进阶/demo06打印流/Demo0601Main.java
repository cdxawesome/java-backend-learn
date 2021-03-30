package java进阶.demo06打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo0601Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream ps = new PrintStream("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        ps.println("我是打印流的输出内容");
        System.setOut(ps);
        System.out.println("我也是一个打印流的输出内容");
        ps.close();
    }
}
