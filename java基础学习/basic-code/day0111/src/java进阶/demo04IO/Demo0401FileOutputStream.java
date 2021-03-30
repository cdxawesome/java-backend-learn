package java进阶.demo04IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo0401FileOutputStream
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        String name="Dylan";
        byte[] bytes = name.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
