package java基础.demo06发红包;

import java.util.ArrayList;

public class Demo01Main
{
    public static void main(String[] args)
    {
        GroupOwner owner = new GroupOwner("群主", 100);
        GroupMember member1 = new GroupMember("成员1", 0);
        GroupMember member2 = new GroupMember("成员2", 12);
        GroupMember member3 = new GroupMember("成员3", 10);
        GroupMember member4 = new GroupMember("成员4", 0);

        ArrayList<Integer> moneyArray = owner.SendMoney(100);
        if(moneyArray==null)
        {
            return;
        }
        member1.GetMoney(moneyArray);
        member2.GetMoney(moneyArray);
        member3.GetMoney(moneyArray);
        member4.GetMoney(moneyArray);

        System.out.println("昵称："+owner.getName()+",余额:"+owner.getTotalMoney());
        System.out.println("昵称："+member1.getName()+",余额:"+member1.getTotalMoney());
        System.out.println("昵称："+member2.getName()+",余额:"+member2.getTotalMoney());
        System.out.println("昵称："+member3.getName()+",余额:"+member3.getTotalMoney());
        System.out.println("昵称："+member4.getName()+",余额:"+member4.getTotalMoney());
    }
}
