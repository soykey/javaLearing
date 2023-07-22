package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;

        try {
            while (true){
                System.out.print("> ");
                String arg = br.readLine();
                if (arg.equals("EXIT")) break;
                sum+= Integer.parseInt(arg);
            }
            System.out.println("合計="+sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
