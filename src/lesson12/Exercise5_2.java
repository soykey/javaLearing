package lesson12;

public class Exercise5_2 {

    static long fibo(int n) {
        if (n<=2) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println((i)+"項目:"+fibo(i));
        }
    }
}
