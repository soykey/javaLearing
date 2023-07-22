package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        try {
            System.out.println("５人分のテストの点数を入力してください。");
            for (int i = 1; i <= 5; i++) {
                System.out.print(i+"人目 -> ");
                sum+=Integer.parseInt(br.readLine());
            }
            System.out.println("テストの合計点は"+sum+"点です。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
