package lesson4;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください -> ");
        int i = sc.nextInt();
        if (i%2 == 0) {
            System.out.println("偶数です。");
        } else {
            System.out.println("奇数です。");
        }
    }
}
