package java进阶复习.demo02File;

/*描述:
将D盘下a.txt文件删除
将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。*/

import java.io.File;

public class Demo0205Main
{
    public static void main(String[] args)
    {
        File file1 = new File("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        if (file1.exists())
            file1.delete();

        File file2 = new File("C:\\Users\\hokte\\Desktop\\a\\aaa");
        file2.delete();

    }
}
