package java进阶.demo05File;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo0501Main
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.close();
        fos.close();
    }
}
