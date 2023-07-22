package lesson5;

public class Exercise3 {
    static double calcarea(double width, double height){
        return (width*height)/2;
    }

    public static void main(String[] args) {
        System.out.println("面積 = " + calcarea(30.0,20.0));
    }
}
