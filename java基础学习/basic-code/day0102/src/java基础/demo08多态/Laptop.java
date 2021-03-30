package java基础.demo08多态;

public class Laptop
{
    public void powerOff()
    {
        System.out.println("笔记本关机");
    }

    public void powerOn()
    {
        System.out.println("笔记本开机");
    }

    public void useDevice(USB device)
    {
        device.openDevice();
        if (device instanceof Mouse)
        {
            Mouse mouse = (Mouse) device;
            mouse.mouseClick();
        }
        else if (device instanceof Keyboard)
        {
            Keyboard keyboard = (Keyboard) device;
            keyboard.keyboardType();
        }
        device.closeDevice();
    }
}
