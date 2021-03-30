package java进阶.demo05File;

import java.io.*;

public class Demo0503Main
{
    public static void main(String[] args) throws IOException
    {
        long sTime = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\MyDoc\\Java后端开发学习路线结合版.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\学习路线.png"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1)
        {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();

        long eTime = System.currentTimeMillis();
        System.out.println("复制成功！共用时" + (eTime - sTime) + "毫秒");
    }
}
