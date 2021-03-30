package java进阶.demo01BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo0101Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\hokte\\Desktop\\a\\a.txt"));
        for (int i = 0; i < 10; i++)
        {
            bw.write("我写入了数据");
            bw.newLine();
        }
        bw.close();
    }
}
