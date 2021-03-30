package java进阶练习.demo01File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo0101Main
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
        osw.write("我爱 Java");
        osw.close();
        fos.close();
    }
}
