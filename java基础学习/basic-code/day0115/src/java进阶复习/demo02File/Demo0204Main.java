package java进阶复习.demo02File;

/*描述:在D盘下创建一个名为ccc的文件夹，要求如下：
1.ccc文件夹中要求包含bbb子文件夹
2.bbb子文件夹要求包含aaa文件夹*/

import java.io.File;

public class Demo0204Main
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\hokte\\Desktop\\a\\ccc\\bbb\\aaa");
        file.mkdirs();
    }
}
