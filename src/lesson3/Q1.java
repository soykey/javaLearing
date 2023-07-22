package lesson3;

public class Q1 {
    public static void main(String[] args) {
        int score = 85;
        if (score==100) {
            System.out.println("満点です。優秀ですね。");
        } else if (score>=80) {
            System.out.println("合格です。おめでとうございます。");
        } else {
            System.out.println("不合格です。残念でした。");
        }
    }
}
