package lesson10;
interface MyInter {
    void print();
}

class Outer {
    void method() {
        new MyInter() {
            public void print() {
                System.out.println("匿名クラス");
            }
        }.print();
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
