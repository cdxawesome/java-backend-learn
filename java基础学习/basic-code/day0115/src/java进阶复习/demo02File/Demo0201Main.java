package java进阶复习.demo02File;

/*描述:创建两个文件对象，分别使用相对路径和绝对路径创建。
答案
操作步骤:
绝对路径创建文件对象：使用File类一个参数的构造方法。
相对路径创建文件对象：使用File类两个参数的构造方法。*/

import java.io.File;

public class Demo0201Main
{
    public static void main(String[] args)
    {
        // 相对路径
        File file1 = new File("a.txt");

        // 绝对路径
        File file2 = new File("C:\\Users\\hokte\\Desktop\\a\\a.txt");
    }
}
