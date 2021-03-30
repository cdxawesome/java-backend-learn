package java进阶.demo03Recursio;

import java.io.File;

public class Demo0306Main
{
    public static void main(String[] args)
    {
        File file1 = new File("C:\\Users\\hokte\\Desktop\\a");
        printPath(file1);
    }

    public static void printPath(File filename)
    {
        // 终极简写
        File[] files = filename.listFiles((dir, name) ->
                new File(dir, name).isDirectory() ||
                        new File(dir, name).getName().toLowerCase().endsWith(".txt")
        );
        for (File file : files)
        {
            if (file.isDirectory())
            {
                printPath(file);
            }
            else
            {
                System.out.println(file);
            }
        }
    }
}
