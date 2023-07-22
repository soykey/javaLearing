package lesson5;

class Triangle {
    double width;
    double height;
    Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double calcArea(){
        return (width*height)/2;
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(30.0, 20.0);
        System.out.println("面積 = " + t.calcArea());
    }
}
