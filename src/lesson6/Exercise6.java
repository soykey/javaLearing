package lesson6;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            switch (args[1]) {
                case "+":
                    System.out.printf("%f + %f = %f",a,b,a+b);
                    break;
                case "-":
                    System.out.printf("%f - %f = %f",a,b,a-b);
                    break;
                case "＊":
                    System.out.printf("%f * %f = %f",a,b,a*b);
                    break;
                case "/":
                    System.out.printf("%f / %f = %f",a,b,a/b);
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("コマンドライン引数の数が不足しています。");
            System.out.println("コマンドライン引数は次のように指定してください。");
            System.out.println("数値 四則演算子 数値");
            System.exit(0);
        }
    }
}
