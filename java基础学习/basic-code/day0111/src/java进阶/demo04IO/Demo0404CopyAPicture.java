package java进阶.demo04IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo0404CopyAPicture
{
    public static void main(String[] args) throws IOException
    {
        // 读取图片文件存为字节数组
        FileInputStream fis = new FileInputStream("C:\\Users\\hokte\\Pictures\\壁纸\\abstraction_sharp_figure_101902_1920x1080.jpg");
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);

        // 从字节数组向指定路径写入图片
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\picture1.jpg");
        fos.write(bytes);

        /*这里要先写output的关闭,因为output关闭了说明input肯定执行完了
        如果写input在前面,当数据量比较大时,output可能还没有执行完,这是就把input关闭会
        造成错误*/
        fos.close();
        fis.close();
    }
}
