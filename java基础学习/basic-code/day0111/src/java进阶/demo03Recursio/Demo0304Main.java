package java进阶.demo03Recursio;

import java.io.File;

public class Demo0304Main
{
    public static void main(String[] args)
    {
        File file1 = new File("C:\\Users\\hokte\\Desktop\\a");
        printPath(file1);
    }

    public static void printPath(File filename)
    {
        File[] files = filename.listFiles();
        if (files == null)
            return;
        for (File file : files)
        {
            System.out.println(file);
            printPath(file);
        }
    }
}
