package java基础.demo02;

import java基础.red.OpenMode;
import java基础.red.RedPacketFrame;

public class MyRed extends RedPacketFrame
{


    public MyRed(String title)
    {
        super(title);
    }

    @Override
    public void setOwnerName(String ownerName)
    {
        super.setOwnerName(ownerName);
    }

    @Override
    public void setOpenWay(OpenMode openWay)
    {
        super.setOpenWay(openWay);
    }
}
