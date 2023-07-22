package lesson12;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int[] k = {2,3,5,7};
        for (int i = 0; i < k.length; i++) {
            for (int j = k[i]*2-1; j < array.length; j+=k[i]) {
                array[j]=1;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i]==0) {
                System.out.print(i+1+" ");
            }
        }
    }
}
