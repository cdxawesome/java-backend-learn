package java进阶.demo02File;

import java.io.File;
import java.io.IOException;

public class Demo0201Main
{
    public static void main(String[] args) throws IOException
    {
        File parent = new File("C:\\Users\\hokte\\Desktop");
        File file1 = new File(parent, "a.txt");
        System.out.println( file1.createNewFile());
        System.out.println(file1.delete());
    }
}
