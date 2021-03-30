package java基础.demo08多态;

public class Keyboard implements USB
{
    @Override
    public void openDevice()
    {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice()
    {
        System.out.println("关闭键盘");
    }

    public void keyboardType()
    {
        System.out.println("键盘进行打字");
    }
}
