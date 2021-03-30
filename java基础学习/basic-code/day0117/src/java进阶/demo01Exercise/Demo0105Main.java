package java进阶.demo01Exercise;

/*
模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。

定义getScoreList方法，随机生成50个数字，数字范围从0到100。
定义countScore方法，统计各个阶段的分数个数。
定义printCount方法，打印各个阶段的统计结果。
*/

import java.util.*;

public class Demo0105Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> scoreList = getScoreList();
        System.out.println(scoreList);
        Map<String, Integer> stringIntegerMap = countScore(scoreList);
        printCount(stringIntegerMap);
    }

    private static ArrayList<Integer> getScoreList()
    {
        Random r = new Random();
        ArrayList<Integer> scoreList = new ArrayList<>();
        int number;
        for (int i = 0; i < 50; i++)
        {
            number = r.nextInt(101);
            scoreList.add(number);
        }
        return scoreList;
    }

    private static Map<String, Integer> countScore(ArrayList<Integer> scoreList)
    {
        Map<String, Integer> stageScore = new HashMap<>();
        stageScore.put("0-39", 0);
        stageScore.put("40-59", 0);
        stageScore.put("60-79", 0);
        stageScore.put("80-100", 0);
        for (Integer score : scoreList)
        {
            if (score >= 0 && score <= 39)
                stageScore.put("0-39", (stageScore.get("0-39")) + 1);
            else if (score >= 40 && score <= 59)
                stageScore.put("40-59", (stageScore.get("40-59")) + 1);
            else if (score >= 60 && score <= 79)
                stageScore.put("60-79", (stageScore.get("60-79")) + 1);
            else if (score >= 80 && score <= 100)
                stageScore.put("80-100", (stageScore.get("80-100")) + 1);
        }

        return stageScore;
    }

    private static void printCount(Map<String, Integer> scoreMap)
    {
        Set<String> stage = scoreMap.keySet();
        for (String s : stage)
        {
            System.out.println("分数段:" + s + ",有" + scoreMap.get(s) + "个");
        }
    }
}
