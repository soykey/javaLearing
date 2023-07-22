package lesson4;

public class Exercise5 {
    public static void main(String[] args) {
        int[] scores = {60, 70, 90, 80, 75, 85, 40, 65, 82, 78};
        double sum = 0.0, avg = 0.0;
        for (double a : scores) {
                sum+=a;
        }
        avg = sum/ scores.length;
        System.out.println("合計点 = " + sum);
        System.out.println("平均点 = " + avg);
        for (int b : scores) {
            if (b > avg){
                System.out.println(b +" -> 平均より上です");
            } else if (b < avg) {
                System.out.println(b +" -> 平均より下です");
            } else {
                System.out.println(b +" -> 平均と同じです");
            }
        }
    }
}
