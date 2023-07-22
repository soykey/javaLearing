package lesson3;

public class Q4 {
    public static void main(String[] args) {
        int result1 = 0;
        for (int i = 3; i < 100; i+=3) {
            result1+=i;
        }
        System.out.println("forの場合"+result1);

        int j = 3, result2=0;
        while (j<100) {
            result2+=j;
            j+=3;
        }
        System.out.println("whileの場合"+result2);
    }
}
