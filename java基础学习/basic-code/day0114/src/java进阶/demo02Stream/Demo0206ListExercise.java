package java进阶.demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo0206ListExercise
{
    public static void main(String[] args)
    {
        ArrayList<String> team1 = new ArrayList<>();
        team1.add("迪丽热巴");
        team1.add("唐诗逸");
        team1.add("高圆圆");
        team1.add("古力娜扎");
        team1.add("赵丽颖");
        team1.add("马尔扎哈");
        team1.add("卓木强巴");
        team1.add("周冬雨");
        team1.add("刘亦菲");

        ArrayList<String> team2 = new ArrayList<>();
        team2.add("赵敏");
        team2.add("张无忌");
        team2.add("周芷若");
        team2.add("张三丰");
        team2.add("灭绝老尼");
        team2.add("黄蓉");
        team2.add("张翠山");
        team2.add("殷素素");
        team2.add("张小花");

        ArrayList<Person> persons1 = traditionalWay(team1, team2);
        System.out.println(persons1);

        ArrayList<Person> persons2 = streamWay(team1, team2);
        System.out.println(persons2);

    }

    private static ArrayList<Person> streamWay(ArrayList<String> team1, ArrayList<String> team2)
    {
        Stream<String> team1Stream = team1.stream().filter(name -> name.length() == 3)
                .limit(3);
        Stream<String> team2Stream = team2.stream().filter(name -> name.startsWith("张"))
                .skip(2);
//        Object[] personArr = Stream.concat(team1Stream, team2Stream).toArray();
        Object[] objects = Stream.concat(team1Stream, team2Stream).map(name -> new Person(name)).toArray();
        ArrayList<Person> persons = new ArrayList<>();
        for (Object s : objects)
        {
            persons.add((Person) s);
        }

        return persons;
    }

    private static ArrayList<Person> traditionalWay(ArrayList<String> team1, ArrayList<String> team2)
    {
        ArrayList<String> team1Name = new ArrayList<>();
        // 只要名字是3个字的成员
        for (String s : team1)
        {
            if (s.length() == 3)
                team1Name.add(s);
        }

        // 只要前三个成员
        while (team1Name.size() > 3)
        {
            team1Name.remove(team1Name.size() - 1);
        }

        ArrayList<String> team2Name = new ArrayList<>();
        // 只要姓张的成员
        for (String s : team2)
        {
            if (s.startsWith("张"))
                team2Name.add(s);
        }

        // 不要前2个人
        team2Name.remove(0);
        team2Name.remove(1);

        // 将两个队伍合并成一个队伍
        ArrayList<String> teamTotal = new ArrayList<>();
        teamTotal.addAll(team1Name);
        teamTotal.addAll(team2Name);

        // 根据姓名创建Person对象,存储到一个新集合中
        ArrayList<Person> persons = new ArrayList<>();
        for (String s : teamTotal)
        {
            persons.add(new Person(s));
        }
        return persons;
    }
}
