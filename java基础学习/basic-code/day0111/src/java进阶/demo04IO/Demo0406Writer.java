package java进阶.demo04IO;

import java.io.FileWriter;
import java.io.IOException;

public class Demo0406Writer
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("w:\\Users\\hokte\\Desktop\\a\\a.txt", true);
        try (fw)
        {
            fw.write("我写入一个数据");
            fw.flush();
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            if (fw != null)
            {
                try
                {
                    fw.close();
                } catch (IOException e)
                {
                    System.out.println(e);
                }
            }

        }


    }
}
