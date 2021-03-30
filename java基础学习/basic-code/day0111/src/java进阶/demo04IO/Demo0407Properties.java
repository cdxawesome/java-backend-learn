package java进阶.demo04IO;

import java.io.*;
import java.util.*;

public class Demo0407Properties
{
    public static void main(String[] args) throws IOException
    {
        storeProperties();
//        storeProperties2();

//        loadProperties();
        loadProperties2();
    }

    // 用字节流读取的Properties数据中文会有乱码
    private static void loadProperties2()
    {
        Properties properties = new Properties();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt");
            properties.load(fis);
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys)
        {
            System.out.println(key + " = " + properties.getProperty(key));
        }
    }

    // 用字节流存储Properties的数据中文会有乱码
    private static void storeProperties2() throws IOException
    {
        Properties properties = new Properties();
        properties.setProperty("张三", "18");
        properties.setProperty("李四", "20");
        properties.setProperty("王五", "29");
        properties.setProperty("赵六", "10");
        properties.store(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\a.txt"),"This is a comment");
    }

    // 用字符流读取的Properties数据中文没问题
    private static void loadProperties()
    {
        Properties properties = new Properties();
        FileReader fr = null;
        try
        {
            fr = new FileReader("C:\\Users\\hokte\\Desktop\\a\\a.txt");
            properties.load(fr);
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            if (fr != null)
            {
                try
                {
                    fr.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys)
        {
            System.out.println(key + " = " + properties.getProperty(key));
        }
    }

    // 用字符流存储Properties的数据中文不会有乱码
    public static void storeProperties()
    {
        Properties properties = new Properties();
        properties.setProperty("张三", "18");
        properties.setProperty("李四", "20");
        properties.setProperty("王五", "29");
        properties.setProperty("赵六", "10");
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("C:\\Users\\hokte\\Desktop\\a\\a.txt");
            properties.store(fw, "This is comment");
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
                    e.printStackTrace();
                }
            }
        }
    }
}
