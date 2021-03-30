package java基础.demo02;

import java基础.red.RedPacketFrame;

public class Demo0201Main
{
    public static void main(String[] args)
    {
        RedPacketFrame red = new MyRed("2021年新年红包");
        red.setOwnerName("CDX");
        red.setOpenWay(new LuckOpen());
    }
}
