package java进阶复习.demo06Exercise;

/*定义ArrayList集合，存入多个字符串。
删除长度大于5的字符串，打印删除后的集合。*/

import java.util.ArrayList;

public class Demo0606Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello1");
        arrayList.add("World2");
        arrayList.add("Dylan3");
        arrayList.add("He");
        arrayList.add("She");

//        for (String s : arrayList)
//        {
//            if(s.length()>5)
//                arrayList.remove(s);
//        }

        arrayList.removeIf((str)->str.length()>5);

        System.out.println(arrayList);
    }
}
