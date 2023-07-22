package report1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = 0,j = 1;
        while (inp<2){
            System.out.print("2以上の整数を入力してください -> ");
            inp = sc.nextInt();
        }
        while (true) {
            System.out.printf("%d: %d\n", j, inp);
            inp = (inp % 2 == 0 ? inp = inp / 2 : inp * 3 + 1);
            j++;
            if (inp==1){
                System.out.printf("%d: %d\n", j, inp);
                break;
            }
        }
    }
}
