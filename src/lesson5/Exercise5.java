package lesson5;

class Arbeit {
    private String id;
    private String name;
    private int age;
    private double time;
    static final double rate = 900.0;

    Arbeit(String id, String name, int age, double time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.time = time;
    }

    void print(){
        System.out.println("ID:"+id+"は"+name+"さんです。");
        System.out.println(name+"さんの年齢は"+age+"歳です。");
        System.out.println(name+"さんの給料は"+(int)(time*rate)+"円です。");
        System.out.println();
    }

}

public class Exercise5 {
    public static void main(String[] args) {
        new Arbeit("s001", "鈴木正義", 20, 106.0).print();
        new Arbeit("s002", "田中真理子", 19, 82.5).print();
        new Arbeit("s003", "佐藤恵一", 21, 112.5).print();
    }
}
