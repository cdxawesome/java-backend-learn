package java进阶.demo05Serializable;

import java.io.*;
import java.util.ArrayList;

public class Demo0501Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
//        serialize();
//        deserialize();

//        serialize1();
        deserialize1();
    }

    private static void serialize1() throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\personArray.txt"));
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("迪丽热巴", 18));
        arrayList.add(new Person("古力娜扎", 23));
        arrayList.add(new Person("高圆圆", 24));
        arrayList.add(new Person("金飞", 19));
        oos.writeObject(arrayList);
        oos.close();
    }

    private static void deserialize1() throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\personArray.txt"));
        ArrayList<Person> arrayList = (ArrayList<Person>) ois.readObject();
        for (Person person : arrayList)
        {
            System.out.println(person);
        }
        ois.close();
    }

    private static void deserialize() throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\hokte\\Desktop\\a\\person.txt"));
        Object o = null;
        o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    public static void serialize() throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\hokte\\Desktop\\a\\person.txt"));
        oos.writeObject(new Person("小明", 18));
//        oos.writeObject(new Person("小兰", 20));
        oos.close();
    }
}
