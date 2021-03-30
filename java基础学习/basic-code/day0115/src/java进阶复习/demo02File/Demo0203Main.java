package java进阶复习.demo02File;

/*描述:在D盘下创建一个名为bbb的文件夹。*/

import java.io.File;

public class Demo0203Main
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\hokte\\Desktop\\a\\abc");
        if (!file.exists())
            file.mkdir();
    }
}
