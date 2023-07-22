package lesson4;

public class Exercise7 {
    public static void main(String[] args) {
        int[] A = new int[1000];
        double sum = 0, avg = 0 ;
        int i = 0;
        while (i != 1000 - 1) {
            int a = (int)(Math.random()*10);
            if (1 <= a && a <= 6) {
                A[i] = a;
                i++;
            }
        }
        for (double a :
                A) {
            sum+=a;
        }
        avg= sum/ A.length;
        System.out.println(avg);
    }
}
