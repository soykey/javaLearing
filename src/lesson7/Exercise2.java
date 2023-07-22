package lesson7;

class Book {
    String title;
    String author;
    int price;

    Book () {}

    public void print () {
        System.out.println("タイトル:"+title+"\n著者名:"+author+"\n本体価格:"+price);
    }

    public double getTaxPrice () {
        return price+1.1;
    }
}

class MyBook extends Book {
    private String data;
    private int rating;

    MyBook(String title, String author, int price, String data, int rating){
        this.title = title;
        this.author = author;
        this.price = price;
        this.data = data;
        this.rating = rating;
    }

    public void print() {
        System.out.println("タイトル:"+title+"\n著者名:"+author+"\n税抜き価格:"+price+"\n購入日:"+data+"\n評価:"+rating);
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        MyBook b1 = new MyBook("Java入門","堂山省吾",2400,"2017.05.27",3);

        MyBook b2 = new MyBook("入門書の次に読むJavaの本","楠田孝一",2800,"2017.05.27",4);

        MyBook b3 = new MyBook("プロフェッショナルJava","金沢信夫",3200,"2017.05.27",5);

        b1.print();
        b2.print();
        b3.print();

        double sum = b1.getTaxPrice() + b2.getTaxPrice() + b3.getTaxPrice();
        System.out.println("合計金額:"+sum);
    }
}
