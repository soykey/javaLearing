package lesson10;

class Count implements Runnable {
    public void run() {
        for(int i=0; i<20; i++) {
            System.out.println("count" + ":" + i);
        }
    }
}

public class CountTest {
    public static void main(String[] args) {
        Count c = new Count();
        Thread t = new Thread(c); // Runnableオブジェクトを引数にしてThreadオブジェクトを作る
        t.start(); // スレッドを開始する
        for(int i=0; i<20; i++) {
            System.out.println("main" + ":" + i);
        }
    }
}