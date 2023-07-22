package lesson12;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.print("ソート前:");
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for(int i=0; i<array.length-1; i++){
            int min = i; // 暫定最小値の添え字を格納する変数
            for(int j=i+1; j<array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }

        System.out.print("ソート後:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
