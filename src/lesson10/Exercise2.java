package lesson10;

class ThreadA implements Runnable {
    public void run() {
        try {
            while(true) {
                System.out.println("A");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        try {
            while(true) {
                System.out.println("B");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        Thread t1 = new Thread(ta);
        Thread t2 = new Thread(tb);
        t1.start();
        t2.start();
    }
}
