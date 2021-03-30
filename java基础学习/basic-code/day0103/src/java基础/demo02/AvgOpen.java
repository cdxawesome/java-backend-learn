package java基础.demo02;

import java基础.red.OpenMode;

import java.util.ArrayList;

public class AvgOpen implements OpenMode
{
    // 平均分红包，有余数则加到最后一个红包
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount)
    {
        int eachMoney = totalMoney / totalCount;
        int remainder = totalMoney % totalCount;
        ArrayList<Integer> moneyPack = new ArrayList<>();
        for (int i = 0; i < totalCount - 1; i++)
        {
            moneyPack.add(eachMoney);
        }
        moneyPack.add(eachMoney + remainder);
        return moneyPack;
    }
}
