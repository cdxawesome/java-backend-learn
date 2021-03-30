package java进阶.demo05File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo0504Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("E:\\MyDoc\\IdeaProjects\\basic-code\\day0117\\data.txt"));
        ArrayList<String> verifyCodeList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null)
            verifyCodeList.add(line);
        br.close();

        System.out.println("请输入一个验证码:");
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        boolean isCorrect = verifyCode(verifyCodeList, code);
        System.out.println(isCorrect ? "验证成功!" : "验证失败");
    }

    private static boolean verifyCode(ArrayList<String> codeList, String code)
    {
        return codeList.contains(code);
    }
}
