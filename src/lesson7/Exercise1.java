package lesson7;

public class Exercise1 {
    static double triangle(double a) {
        return (Math.sqrt(3)/4)*Math.pow(a,2);
    }

    static double triangle (double a, double b) {
        return a*b/2;
    }

    static double triangle (double a, double b, double c) {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args) {
        System.out.println("正三角形 "+triangle(10));
        System.out.println("直角三角形 "+triangle(10,12));
        System.out.println("一般的な三角形 "+triangle(13,14,15));
    }
}
