package java进阶.demo01文件上传服务器;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        // 创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);

        while(true)
        {
            Socket accept = serverSocket.accept();

            // 每次有一个客户端链接都开启一个线程
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        // 给每一个上传的文件设置好文件名和保存位置
                        String filename = "cdx" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
                        File file = new File("C:\\Users\\hokte\\Desktop\\upload");
                        if (!file.exists())
                            file.mkdir();
                        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);

                        // 将文件写入硬盘
                        InputStream inputStream = accept.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes)) != -1)
                        {
                            fos.write(bytes, 0, len);
                        }

                        // 向客户端发送消息
                        OutputStream outputStream = accept.getOutputStream();
                        outputStream.write("文件上传成功".getBytes());

                        // 释放资源
                        fos.close();
                        accept.close();
                    }
                    catch (IOException e)
                    {
                        System.out.println(e);
                    }
                }
            }).start();

        }
    }
}
