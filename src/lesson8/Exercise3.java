package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double sum = 0;

        try {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print("["+i+"] -> ");
                    sum+=Double.parseDouble(br.readLine());
                }
                System.out.println("合計 = "+sum);
            } catch (NumberFormatException f) {
                System.out.println("数値を入力してください。");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
