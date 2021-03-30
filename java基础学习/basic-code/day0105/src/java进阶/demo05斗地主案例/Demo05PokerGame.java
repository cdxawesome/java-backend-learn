package java进阶.demo05斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

public class Demo05PokerGame
{
    public static void main(String[] args)
    {
        ArrayList<String> poker = initPoker();
        System.out.println("开始发牌");
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> tableCards = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++)
        {
            if (i >= poker.size() - 3)
            {
                tableCards.add(poker.get(i));
                continue;
            }

            if (i % 3 == 0)
                player1.add(poker.get(i));
            else if (i % 3 == 1)
                player2.add(poker.get(i));
            else if (i % 3 == 2)
                player3.add(poker.get(i));
        }
        poker.clear();

        System.out.println("Player1:" + player1);
        System.out.println("Player2:" + player2);
        System.out.println("Player3:" + player3);
        System.out.println("tableCards:" + tableCards);

//        System.out.println("自行整理牌的顺序");
    }

    /**
     * 初始化一副牌，返回一副已经随机打乱顺序的牌
     **/
    public static ArrayList<String> initPoker()
    {
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] color = {"♠", "♥", "♣", "♦"};
        ArrayList<String> pokerCards = new ArrayList<>();
        pokerCards.add("Joker");
        pokerCards.add("Queen");
        for (String s : number)
        {
            for (String value : color)
            {
                pokerCards.add(value + s);
            }
        }
        // 扑克牌初始化完成
        System.out.println("扑克牌初始化完成");
        System.out.println(pokerCards);

        // 洗牌
        System.out.println("洗牌");
        Collections.shuffle(pokerCards);
        System.out.println(pokerCards);

        return pokerCards;
    }
}
