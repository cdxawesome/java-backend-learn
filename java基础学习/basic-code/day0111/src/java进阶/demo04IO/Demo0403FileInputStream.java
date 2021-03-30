package java进阶.demo04IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo0403FileInputStream
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
//        for (byte aByte : bytes)
//        {
//            System.out.print((char)aByte);
//        }
        System.out.println(new String(bytes));
        fis.close();
    }
}
