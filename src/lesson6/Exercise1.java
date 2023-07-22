package lesson6;

interface InterCar {
    String getName();

    double getSpeed();


    void setName(String name);

    void setSpeed(double speed);

    void print();
}

class Sportscar implements InterCar {
    private String name;
    private double speed;

    Sportscar(String name, double speed){
        setName(name);
        setSpeed(speed);
    }

    public String getName() {
        return this.name;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void print() {
        System.out.println(this.getName() + "のスピードは" + this.getSpeed() + "km/hです。");
    }
}


public class Exercise1 {
    public static void main(String[] args) {
        Sportscar sportscar = new Sportscar("スポーツカー",100.0);
        sportscar.print();
    }
}

