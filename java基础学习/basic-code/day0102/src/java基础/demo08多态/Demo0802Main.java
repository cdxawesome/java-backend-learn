package java基础.demo08多态;

public class Demo0802Main
{
    public static void main(String[] args)
    {
        Laptop thinkpad = new Laptop();
        USB ikbc=new Keyboard();
        USB thunderboot=new Mouse();
        thinkpad.powerOn();
        thinkpad.useDevice(ikbc);
        thinkpad.useDevice(thunderboot);
        thinkpad.powerOff();
    }
}
