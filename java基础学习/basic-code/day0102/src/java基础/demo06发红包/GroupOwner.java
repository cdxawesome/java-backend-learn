package java基础.demo06发红包;

import java.util.ArrayList;

public class GroupOwner extends User
{
    public GroupOwner()
    {
        super();
    }

    public GroupOwner(String name, int totalMoney)
    {
        super(name, totalMoney);
    }

    public ArrayList<Integer> SendMoney(int moneyOfSend)
    {
        if (moneyOfSend > this.getTotalMoney())
        {
            System.out.println("您没有这么多钱可以发");
            return null;
        }
        if (userCount <= 1)
        {
            System.out.println("群里面只有群主一人，无法执行发红包功能!");
            return null;
        }
        else
        {
            ArrayList<Integer> money = new ArrayList<>();
            int moneyCount = userCount - 1;
            int moneyNumber = moneyOfSend / moneyCount;
            for (int i = 0; i < userCount - 1; i++)
            {
                money.add(moneyNumber);
                this.setTotalMoney(getTotalMoney() - moneyNumber);
            }
            return money;
        }

    }
}
