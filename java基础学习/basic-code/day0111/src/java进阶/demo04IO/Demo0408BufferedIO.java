package java进阶.demo04IO;

import java.io.*;

public class Demo0408BufferedIO
{
    public static void main(String[] args) throws IOException
    {
        String filename = "C:\\Users\\hokte\\Desktop\\a\\a.txt";
        bufferedWrite(filename);
        bufferedRead(filename);
    }

    public static void bufferedRead(String filename)
    {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        byte[] bytes = new byte[1024];
        try
        {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            int len = 0;
            while ((len = bis.read(bytes)) != -1)
            {
                System.out.print(new String(bytes, 0, len));
            }
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            try
            {
                fis.close();
                bis.close();
            } catch (IOException e)
            {
                System.out.println(e);
            }
        }
    }

    public static void bufferedWrite(String filename)
    {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try
        {
            fos = new FileOutputStream(filename, true);
            bos = new BufferedOutputStream(fos);
            bos.write("我是新增的内容".getBytes());
            bos.flush();
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            if (fos != null)
            {
                try
                {
                    bos.close();
                    fos.close();
                } catch (IOException e)
                {
                    System.out.println(e);
                }

            }

        }


    }
}
