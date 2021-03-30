package java基础.demo08多态;

public class Mouse implements USB
{
    @Override
    public void openDevice()
    {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice()
    {
        System.out.println("关闭鼠标");
    }

    public void mouseClick()
    {
        System.out.println("鼠标进行点击");
    }
}
