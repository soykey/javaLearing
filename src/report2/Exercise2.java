package report2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Exercise2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double avg_eng = 0;
        double avg_math = 0;
        int i = 0;

        String[] names = new String[100000];
        double[] eng_scores = new double[100000];
        double[] math_scores = new double[100000];

        System.out.println("名前に\"END\"と入力すると入力を終了して各科目の平均点を出力します");

        try {
            while (true) {
                System.out.print((i + 1) + "人目の名前を入力してください -> ");
                String name = br.readLine();
                if (Objects.equals(name, "END")) {
                    break;
                } else {
                    names[i] = name;
                }

                System.out.print((i + 1) + "人目の英語の点数を入力してください -> ");
                double eng = Double.parseDouble(br.readLine());
                avg_eng += eng;
                eng_scores[i] = eng;

                System.out.print((i + 1) + "人目の数学の点数を入力してください -> ");
                double math = Double.parseDouble(br.readLine());
                avg_math += math;
                math_scores[i] = math;

                i++;

                System.out.println();
            }

            for (int j = 0; j < names.length; j++) {
                if (names[j]==null) {break;}
                System.out.println();
                System.out.println("氏名 -> " + names[j]);
                System.out.println("英語 -> " + eng_scores[j] + "点");
                System.out.println("数学 -> " + math_scores[j] + "点");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("英語の平均点 = " + (avg_eng / i));
        System.out.println("数学の平均点 = " + (avg_math / i));

    }
}