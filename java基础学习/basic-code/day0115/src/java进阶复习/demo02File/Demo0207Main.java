package java进阶复习.demo02File;

/*描述:
1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)*/

import java.io.File;

public class Demo0207Main
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\hokte\\Desktop\\a");
        if(file.isFile())
            System.out.println(file.getName()+"是一个文件");
        else
            System.out.println(file.getName()+"不是一个文件");

        if(file.isDirectory())
            System.out.println(file.getName()+"是一个文件夹");
        else
            System.out.println(file.getName()+"不是一个文件夹");
    }
}
