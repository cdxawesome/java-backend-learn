package java进阶.demo04IO;

import java.io.*;

public class Demo0409CopyTime
{
    public static void main(String[] args) throws IOException
    {
        normalCopy();
        bufferedCopy();
    }

    public static void bufferedCopy() throws IOException
    {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\hokte\\Downloads\\wpspdf.8639.17.12012.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\wpspdf.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

//        byte[] bytes = new byte[fis.available()];
        int len = 0;
        while ((len = bis.read()) != -1)
        {
            fos.write(len);
        }


        fos.close();
        bos.close();
        fis.close();
        bis.close();


        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime) / 1000.00 + "秒");
    }

    public static void normalCopy() throws IOException
    {
        long startTime = System.currentTimeMillis();

        // 读取文件存为字节数组
        FileInputStream fis = new FileInputStream("C:\\Users\\hokte\\Downloads\\wpspdf.8639.17.12012.exe");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\wpspdf.exe");
//        byte[] bytes = new byte[fis.available()];
        // 以下是逐字节读取
        int len = 0;
        while ((len = fis.read()) != -1)
        {
            fos.write(len);
        }

        /*这里要先写output的关闭,因为output关闭了说明input肯定执行完了
        如果写input在前面,当数据量比较大时,output可能还没有执行完,这是就把input关闭会
        造成错误*/
        fos.close();
        fis.close();

        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime) / 1000.00 + "秒");
    }
}
