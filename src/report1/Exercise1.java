package report1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"つ目の整数を入力してください -> ");
            array[i] = sc.nextInt();
        }
        for (int a : array) {
            System.out.print(a+", ");
        }
    }
}
