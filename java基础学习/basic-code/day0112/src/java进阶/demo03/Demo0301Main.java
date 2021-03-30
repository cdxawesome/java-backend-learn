package java进阶.demo03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo0301Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hokte\\Desktop\\a\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hokte\\Desktop\\a\\a排序.txt"));
        HashMap<String, String> text = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty())
        {
            String[] split = line.split("\\.");
            text.put(split[0], split[1]);
        }

        for (String key : text.keySet())
        {
            line = text.get(key);
            line = key + "." + line;
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
