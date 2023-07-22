package report1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください -> ");
        int n = sc.nextInt();
        if (n<=0) {
            System.out.println(0);
        } else {
            System.out.printf("1から%dまでの合計は%d",n,(n*(n+1)/2));
        }
    }
}
