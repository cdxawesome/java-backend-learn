package java进阶.demo01Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Collection
{
    public static void main(String[] args)
    {
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        coll.add("你好");
        coll.add("世界");
        coll.add("Java");

        Iterator<String> it = coll.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
