package lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("sample.txt");
            br = new BufferedReader(fr);
            String data = null;
            int sum = 0;
            while ( (data = br.readLine()) != null) {
                System.out.println(data);
                sum+=Integer.parseInt(data);
            }
            System.out.println("合計 = "+sum);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("IO error.");
        }
    }
}
