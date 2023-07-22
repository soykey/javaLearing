package lesson12;

public class Exercise5_1 {
    public static void main(String[] args) {
        long[] a = new long[100];
        a[0]=1;
        a[1]=1;

        for (int i = 2; i <= 30; i++) {
            a[i]=a[i-1]+a[i-2];
        }

        for (int i = 0; i < 30; i++) {
            System.out.println((i+1)+"項目:"+a[i]);
        }
    }
}
