package lesson9;

import java.io.*;
import java.util.StringTokenizer;

public class Exercise4 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader("sample.txt");
            br = new BufferedReader(fr);
            String data = null;
            while ((data= br.readLine())!=null) {
                StringTokenizer s = new StringTokenizer(data,",");
                String name = s.nextToken();
                String id = s.nextToken();
                String age = s.nextToken();
                System.out.println("名前:"+name);
                System.out.println("学籍番号:"+id);
                System.out.println("年齢:"+age);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
