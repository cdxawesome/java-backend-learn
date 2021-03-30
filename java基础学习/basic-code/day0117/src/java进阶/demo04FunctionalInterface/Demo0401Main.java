package java进阶.demo04FunctionalInterface;

public class Demo0401Main
{
    private static void showLongTime(CurrentTimePrinter timePrinter)
    {
        timePrinter.printCurrentTime();
    }

    public static void main(String[] args)
    {
        showLongTime(()-> System.out.println(System.currentTimeMillis()));
    }
}
