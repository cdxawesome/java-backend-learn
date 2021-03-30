package java进阶.demo04IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo0402FileOutputStream
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt",true);
        String appendStr=" 这是一个中文";
        fos.write(appendStr.getBytes());

        String appendStr2="\nHello World!";
        fos.write(appendStr2.getBytes());
        fos.close();
    }
}
