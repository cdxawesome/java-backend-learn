package java进阶.demo04FunctionalInterface;

public class Demo0403Main
{
    static void decToHex(int num, NumberToString nts)
    {
        System.out.println(nts.convert(num));
    }

    public static void main(String[] args)
    {
        decToHex(17, Integer::toHexString);
    }
}
