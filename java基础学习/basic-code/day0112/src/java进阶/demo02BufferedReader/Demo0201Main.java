package java进阶.demo02BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo0201Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader vr = new BufferedReader(new FileReader("C:\\Users\\hokte\\Desktop\\a\\a.txt"));
        String str;
        while ((str = vr.readLine()) != null)
            System.out.println(str);
        vr.close();
    }
}
