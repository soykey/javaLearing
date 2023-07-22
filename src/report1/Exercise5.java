package report1;

public class Exercise5 {
    public static void main(String[] args) {
        int [] A = new int[10000];
        for (int i = 0; i<10000; i++) {
            A[i] = (int) (Math.random()*10);
        }
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int b : A) {
                count += b == i ? 1 : 0;
            }
            System.out.printf("%dの出現回数 = %d回\n",i,count);
        }
    }
}
