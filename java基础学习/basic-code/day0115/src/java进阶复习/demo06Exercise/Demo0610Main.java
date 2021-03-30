package java进阶复习.demo06Exercise;

/*定义用户类，属性为用户名和密码。
使用集合存储多个用户对象。
录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
登录失败时，当用户名错误，提示没有该用户。
登录失败时，当密码错误时，提示密码有误。*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo0610Main
{
    public static void main(String[] args)
    {
        ArrayList<User> users = initUserData();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();

        boolean b = checkLogin(users, userName, password);
        System.out.println(b);

    }

    private static boolean checkLogin(ArrayList<User> users, String userName, String password)
    {
        boolean login = false;
        for (User user : users)
        {
            if (user.getUser_name().equals(userName))
            {
                if (user.isPasswordCorrect(password))
                {
                    System.out.println("登录成功!");
                    return true;
                }
                else
                {
                    System.out.println("登录失败，密码错误！");
                    return false;
                }
            }
        }
        System.out.println("登录失败，用户名错误!");
        return false;
    }

    private static ArrayList<User> initUserData()
    {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("张三", "a12345"));
        users.add(new User("李四", "b12345"));
        users.add(new User("王五", "c12345"));
        users.add(new User("赵六", "d12345"));
        users.add(new User("田七", "e12345"));

        return users;
    }
}
