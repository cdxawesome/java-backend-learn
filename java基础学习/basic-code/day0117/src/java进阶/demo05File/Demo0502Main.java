package java进阶.demo05File;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo0502Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt"));
        bos.write("I love Java.".getBytes());
        bos.close();
    }
}
