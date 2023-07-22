package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("身長[cm]と体重[kg]を入力してください。");
            System.out.print("身長[cm] -> ");
            String height = br.readLine();
            System.out.print("体重[kg] -> ");
            String weight = br.readLine();
            System.out.println("身長は"+height+"cmです。");
            System.out.println("体重は"+weight+"kgです。");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
