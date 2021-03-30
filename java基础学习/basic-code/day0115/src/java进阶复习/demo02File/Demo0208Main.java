package java进阶复习.demo02File;

/*描述:
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件*/

import java.io.File;

public class Demo0208Main
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\hokte\\Desktop\\a");
        File[] files = file.listFiles();
        for (File file1 : files)
        {
            System.out.println(file1.getName());
        }
    }
}
