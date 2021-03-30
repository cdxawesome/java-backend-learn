package java基础.demo06发红包;

import java.util.ArrayList;

public class GroupMember extends User
{
    public GroupMember()
    {
        super();
    }

    public GroupMember(String name, int totalMoney)
    {
        super(name,totalMoney);
    }

    public void GetMoney(ArrayList<Integer> moneyArray)
    {
        this.setTotalMoney(this.getTotalMoney() + moneyArray.get(moneyArray.size() - 1));
        moneyArray.remove(moneyArray.size() - 1);
    }
}
