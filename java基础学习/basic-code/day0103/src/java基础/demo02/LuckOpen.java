package java基础.demo02;

import java基础.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class LuckOpen implements OpenMode
{
    // 手气红包，最低拿1分，最高拿不超过剩下金额平均数的2倍
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount)
    {
        Random r = new Random();
        ArrayList<Integer> moneyPack = new ArrayList<>();
        int money = 0;
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount-1; i++)
        {
            money = r.nextInt(leftMoney / leftCount * 2) + 1;
            moneyPack.add(money);
            leftMoney -= money;
            leftCount--;
        }
        moneyPack.add(leftMoney);
        return moneyPack;
    }
}
