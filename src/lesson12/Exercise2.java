package lesson12;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int memo = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            if (array[i]==14) {
                memo = i + 1;
            }
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(memo!=0?"14は"+memo+"番目です。":"14は見つかりませんでした。");
    }
}
