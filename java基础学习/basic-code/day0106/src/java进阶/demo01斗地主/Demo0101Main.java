package java进阶.demo01斗地主;

import java.util.*;

public class Demo0101Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> poker = initPoker();
        ArrayList<Integer> pokerPos = new ArrayList<>();
        for (int i = 0; i < 54; i++)
            pokerPos.add(i);
        Collections.shuffle(pokerPos);
        System.out.println("---洗牌完成，开始发牌---");

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> tableCards = new ArrayList<>();

        for (int i = 0; i < pokerPos.size(); i++)
        {
            if (i >= poker.size() - 3)
            {
                tableCards.add(pokerPos.get(i));
                continue;
            }
            if (i % 3 == 0)
                player1.add(pokerPos.get(i));
            else if (i % 3 == 1)
                player2.add(pokerPos.get(i));
            else
                player3.add(pokerPos.get(i));
        }

        System.out.println("---发牌完成---");
        System.out.println("---看牌---");

        System.out.print("玩家1: ");
        showPoker(player1, poker);
        System.out.print("玩家2: ");
        showPoker(player2, poker);
        System.out.print("玩家3: ");
        showPoker(player3, poker);
        System.out.print("底牌: ");
        showPoker(tableCards, poker);

    }

    public static HashMap<Integer, String> initPoker()
    {
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] color = {"♠", "♥", "♣", "♦"};
        HashMap<Integer, String> poker = new HashMap<>();
        poker.put(53, "Queen");
        poker.put(52, "Joker");
        int pos = 51;
        for (String s : number)
        {
            for (String co : color)
            {
                poker.put(pos, co + s);
                pos--;
            }
        }
        // 扑克牌初始化完成
        System.out.println("---扑克牌初始化完成---");
        System.out.println(poker);

        return poker;
    }

    public static void showPoker(ArrayList<Integer> pos, HashMap<Integer, String> poker)
    {
        // 用匿名内部类方式重写比较的方法，使其降序排列
        pos.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2 - o1;
            }
        });
        for (Integer i : pos)
        {
            System.out.print(" " + poker.get(i));
        }
        System.out.println("");
    }
}
