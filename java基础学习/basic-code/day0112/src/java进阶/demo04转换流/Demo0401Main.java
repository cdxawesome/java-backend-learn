package java进阶.demo04转换流;

import java.io.*;

public class Demo0401Main
{
    public static void main(String[] args) throws IOException
    {
//        writeUtf_8();
//        writeGBK();

//        readUtf_8();
        readGBK();
    }

    private static void readGBK() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\gbk.txt"), "gbk");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1)
        {
            String s = String.valueOf(chars, 0, len);
            System.out.println(s);
        }
        isr.close();
    }

    private static void readUtf_8() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\utf-8.txt"), "utf-8");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1)
        {
            String s = String.valueOf(chars, 0, len);
            System.out.println(s);
        }
        isr.close();
    }

    private static void writeGBK() throws IOException
    {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\gbk.txt", true), "gbk");
        osw.write("我是gbk内容");
        osw.flush();
        osw.close();
    }

    private static void writeUtf_8() throws IOException
    {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\utf-8.txt", true), "utf-8");
        osw.write("我是utf-8内容");
        osw.flush();
        osw.close();
    }
}
