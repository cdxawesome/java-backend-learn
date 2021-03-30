package java进阶.demo04IO;

import java.io.FileReader;
import java.io.IOException;

public class Demo0405Reader
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("C:\\Users\\hokte\\Desktop\\a\\a.txt");
        char[] charArray = new char[1024];
        int len = fr.read(charArray);
        int i = 0;
        while (len != i)
        {
            System.out.print(charArray[i++]);
        }

        fr.close();
    }
}
