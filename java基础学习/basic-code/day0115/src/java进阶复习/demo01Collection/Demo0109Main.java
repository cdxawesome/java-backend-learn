package java进阶复习.demo01Collection;

/*向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫*/

import java.util.ArrayList;
import java.util.List;

public class Demo0109Main
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("二丫");
        names.add("钱六");
        names.add("孙七");
        for (int i = 0; i < names.size(); i++)
        {
            String s = names.get(i);
            if (s.equals("二丫"))
                names.set(i, "王小丫");
        }

        System.out.println(names);
    }
}
