package java进阶.demo01Exercise;

/*定义getNumList方法，随机生成100个数字，数字范围从1到10。
定义printCount方法，统计每个数字出现的次数并打印到控制台。*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo0104Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = getNumList(100);
        System.out.println(numList);
        printCount(numList);
    }

    /**
     * 随机生成quantity个随机数,每个随机数的范围是1-10
     **/
    private static ArrayList<Integer> getNumList(int quantity)
    {
        Random r = new Random();
        int number;
        ArrayList<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < quantity; i++)
        {
            number = r.nextInt(10) + 1;
            randomNumber.add(number);
        }

        return randomNumber;
    }

    /**统计并打印每个数字出现的次数**/
    private static void printCount(List<Integer> list)
    {
        int[] counter = new int[10];
        int index;
        for (int i = 0; i < list.size(); i++)
        {
            index = list.get(i);
            counter[index - 1]++;
        }

        for (int i = 0; i < counter.length; i++)
        {
            System.out.println("数字:" + (i + 1) + "出现的次数是:" + counter[i]);
        }
    }
}
