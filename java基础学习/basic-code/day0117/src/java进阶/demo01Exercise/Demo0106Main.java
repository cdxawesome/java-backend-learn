package java进阶.demo01Exercise;

/*
* 随机生成n张扑克牌。
*
* 使用集合保存所有的扑克牌对象。
从所有牌中，随机移除n张牌，保存到新集合。
判断n的值，不能超越一副扑克牌的范围。
* */

import java.util.ArrayList;
import java.util.Random;

public class Demo0106Main
{
    public static void main(String[] args)
    {
        ArrayList<String> poker = new ArrayList<>();
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] value = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        poker.add("Queen");
        poker.add("Joker");
        for (int i = 0; i < value.length; i++)
        {
            for (int j = 0; j < color.length; j++)
                poker.add(color[j] + value[i]);
        }
        System.out.println(poker);
        System.out.println(getRandomPoker(poker, 10));
        System.out.println(poker);
    }

    public static ArrayList<String> getRandomPoker(ArrayList<String> poker, int count)
    {
        if (count > poker.size())
        {
            System.out.println("取值范围超出扑克牌张数");
            return null;
        }
        ArrayList<String> randomPoker = new ArrayList<>();
        Random r = new Random();
        int index;
        for (int i = 0; i < count; i++)
        {
            index = r.nextInt(poker.size());
            randomPoker.add(poker.remove(index));
        }
        return randomPoker;
    }
}
