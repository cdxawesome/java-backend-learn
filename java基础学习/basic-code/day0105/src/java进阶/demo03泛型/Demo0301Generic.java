package java进阶.demo03泛型;

public class Demo0301Generic
{
    public static void main(String[] args)
    {
        Student<String> one = new Student<>();
        one.setName("这是一个泛型");
        System.out.println(one.getName());

        Student<Integer> two = new Student<>();
        two.setName(10);
        System.out.println(two.getName());
    }
}
