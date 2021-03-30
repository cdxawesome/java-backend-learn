package java进阶.demo02Exception;

import java.io.IOException;

public class Demo0202Main
{
    public static void main(String[] args)
    {
        try
        {
            readFile("a.png");
        }
        catch (IOException e)
        {
            System.out.println("文件后缀无效");
        }
        finally
        {
            System.out.println("资源释放");
        }

        System.out.println("后续代码");
    }

    public static void readFile(String filename) throws IOException
    {
        if (!filename.endsWith(".txt"))
            throw new IOException("文件名后缀错误");
        System.out.println("文件读取成功");
    }
}
