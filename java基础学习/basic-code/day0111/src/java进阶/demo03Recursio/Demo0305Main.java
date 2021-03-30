package java进阶.demo03Recursio;

import java.io.File;

public class Demo0305Main
{
    public static void main(String[] args)
    {
        File file1 = new File("C:\\Users\\hokte\\Desktop\\a");
        printPath(file1);
    }

    public static void printPath(File filename)
    {
        File[] files = filename.listFiles();
        for (File file : files)
        {
            if(file.isDirectory())
            {
                printPath(file);
            }
            else
            {
                String stringName = file.getName().toLowerCase();
                if (stringName.endsWith(".txt"))
                    System.out.println(file);
            }
        }
    }
}
