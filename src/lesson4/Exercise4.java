package lesson4;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        int result = 0;
        for (int a : array) {
            System.out.printf("%d,",a);
            result+=a;
        }
        System.out.println();
        System.out.println("合計="+result);
    }
}