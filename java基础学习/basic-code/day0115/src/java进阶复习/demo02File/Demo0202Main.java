package java进阶复习.demo02File;

/*描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。*/

import java.io.File;
import java.io.IOException;

public class Demo0202Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\hokte\\Desktop\\a\\abc.txt");
        if(!file.exists())
            file.createNewFile();
    }
}
