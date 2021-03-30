package java进阶.demo03CustomException;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo0301Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name = "";
        do
        {
            System.out.println("请输入注册的用户名:");
            name = sc.next();
            try
            {
                isNameValid(name, names);
            } catch (RegisterException e)
            {
                System.out.println(e.getMessage());
                continue;
            }
            names.add(name);
            System.out.println("注册成功");
        } while (!name.equals("exit"));

    }

    /**
     * 判断name是否有效
     **/
    public static void isNameValid(String name, ArrayList<String> nameList) throws RegisterException
    {
        for (String n : nameList)
        {
            if (n.equals(name))
            {
                throw new RegisterException("名字重复");
            }
        }
    }
}
