package cn.itcast.day04.demo07ArrayList;

import java.util.ArrayList;

public class Demo0703
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("王刚","001"));
        students.add(new Student("赵四儿","002"));
        students.add(new Student("邓绿棋","003"));
        students.add(new Student("大雨","004"));

        int i=0;
        for(i=0;i<students.size();i++)
        {
            System.out.println("学号:"+students.get(i).getId()+"  姓名:"+students.get(i).getName());
        }
    }
}
