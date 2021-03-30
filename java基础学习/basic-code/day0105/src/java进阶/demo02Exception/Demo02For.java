package java进阶.demo02Exception;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02For
{
    public static void main(String[] args)
    {
        Collection<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            numbers.add(i);
        }

        for (int i : numbers)
            System.out.println(i);

    }
}
