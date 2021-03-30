package java进阶.demo01文件上传服务器;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client
{
    public static void main(String[] args) throws IOException
    {
        // 读取本地文件到文件流中
        FileInputStream fis = new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\picture1.jpg");
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);

        // 创建Socket,把文件数据写进socket
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytes);

        // 给上传到服务器的文件流写一个终止序列,让服务器知道流数据在哪终止
        socket.shutdownOutput();

        // 接受服务器回写的数据
        InputStream inputStream = socket.getInputStream();
        bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes)) != -1)
            System.out.println(new String(bytes, 0, len));

        // 释放资源
        fis.close();
        socket.close();
    }
}
