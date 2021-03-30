package java进阶.demo01Exercise;

/*循环录入的方式，1：表示继续录入，0：表示结束录入。
定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
使用ArrayList集合，保存学生对象，录入结束后，遍历集合。*/

import java.util.ArrayList;
import java.util.Scanner;

public class Demo0102Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Demo0102Student> students = new ArrayList<>();
        String name;
        int age;
        int choice = 1;
        while (choice != 0)
        {
            System.out.println("请输入学生姓名:");
            name = sc.next();
            System.out.println("请输入学生年龄:");
            age = sc.nextInt();
            students.add(new Demo0102Student(name, age));
            System.out.println("数据添加成功！输入1继续录入，输入0结束程序:");
            choice = sc.nextInt();
        }

        for (Demo0102Student student : students)
        {
            System.out.println("姓名:" + student.getName() + ",年龄:" + student.getAge());
        }

    }
}
