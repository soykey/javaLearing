package lesson7;

class MyMenu implements Menu {
    private String name;
    private int calorie;

    private int price;

    MyMenu (String name, int calorie, int price) {
        this.name=name;
        this.calorie=calorie;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public double getTaxPrice() {
        return price*1.1;
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        MyMenu m1 = new MyMenu("モーニングセット（トースト）",350,500);
        MyMenu m2 = new MyMenu("日替りランチ（ヒレカツ）",720,900);
        MyMenu m3 = new MyMenu("スペシャルディナー（ステーキ）",1510,1500);

        System.out.println("品名:"+m1.getName()+"\nカロリー:"+m1.getCalorie()+"\n税込価格:"+m1.getTaxPrice());
        System.out.println("品名:"+m2.getName()+"\nカロリー:"+m2.getCalorie()+"\n税込価格:"+m2.getTaxPrice());
        System.out.println("品名:"+m3.getName()+"\nカロリー:"+m3.getCalorie()+"\n税込価格:"+m3.getTaxPrice());

        double priceSum = m1.getTaxPrice()+m2.getTaxPrice()+m3.getTaxPrice();
        int calorieSum = m1.getCalorie()+m2.getCalorie()+m3.getCalorie();
        System.out.println("合計金額:"+priceSum+"\n合計カロリー:"+calorieSum);
    }
}
