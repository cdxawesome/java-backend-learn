package java进阶复习.demo06Exercise;

/*接收三个参数，一个整数，一个运算符，另一个整数。
计算出运算结果。
无法运算时，返回null。*/

import java.util.Scanner;

public class Demo0608Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            System.out.println(calc(a, op, b));
        }

    }

    public static String calc(int a, String o, int b)
    {
        switch (o)
        {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                return String.valueOf(a / b);
            case "%":
                return String.valueOf(a % b);
            default:
                return null;
        }
    }
}
