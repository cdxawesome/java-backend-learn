package java进阶.demo02BS模式;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(8080);

        /* 当浏览器获取到服务器返回的网页页面时,如果页面中有图片,那么浏览器会开启线程去获取
        这个图片.服务器端需要一直开启,以便浏览器获取图片.同时服务器每接收到一个浏览器的请求,
        就开启一个线程,提高传输效率
        */
        while (true)
        {
//            getBrowserMsg(serverSocket);
            browser(serverSocket);
        }
    }

    private static void getBrowserMsg(ServerSocket serverSocket) throws IOException
    {
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1)
        {
            System.out.println(new String(bytes, 0, len));
        }
        socket.close();
    }

    public static void browser(ServerSocket serverSocket) throws IOException
    {
        Socket socket = serverSocket.accept();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    InputStream is = socket.getInputStream();

                    // 创建一个缓冲流,构造方法传入上面的is
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));

                    // 读取客户端数据的第一行中,用空格分割,得到客户端请求网页的地址
                    String arr[] = br.readLine().split(" ");
                    String htmlPath = arr[1].substring(1);
                    System.out.println(htmlPath);

                    // 根据地址读取本地文件
                    FileInputStream fis = new FileInputStream(htmlPath);
                    OutputStream os = socket.getOutputStream();

                    // 写入Http协议响应头,固定写法
                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    // 必须要写入空行,否则浏览器不解析
                    os.write("\r\n".getBytes());

                    // 向浏览器写入数据
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = fis.read(bytes)) != -1)
                        os.write(bytes, 0, len);

                    // 释放资源
                    fis.close();
                    socket.close();
                } catch (IOException e)
                {
                    System.out.println(e);
                }
            }
        }).start();
    }
}
