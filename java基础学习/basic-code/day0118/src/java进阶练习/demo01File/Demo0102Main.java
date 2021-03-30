package java进阶练习.demo01File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo0102Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "gbk");
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1)
        {
            System.out.println(new String(chars, 0, len));
        }

        isr.close();
    }
}
