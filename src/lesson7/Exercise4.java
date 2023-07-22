package lesson7;

public class Exercise4 {

    public static void div(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("整数をゼロで割ることはできません。");
        }
    }

    public static void main(String[] args) {
        div(5, 0);
    }
}
