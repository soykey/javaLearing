package report2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Exercise5 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("score_data.txt");
            br = new BufferedReader(fr);
            String data = null;

            double avg_eng = 0;
            double avg_math = 0;

            int i = 0;
            while ((data = br.readLine())!=null) {
                StringTokenizer s = new StringTokenizer(data,",");
                String name = s.nextToken();
                int eng = Integer.parseInt(s.nextToken());
                int math = Integer.parseInt(s.nextToken());

                System.out.println("氏名 -> " + name);
                System.out.println("英語 -> " + eng + "点");
                System.out.println("数学 -> " + math + "点");

                avg_eng+=eng;
                avg_math+=math;
                i++;
            }

            System.out.println("英語の平均点 = " + (avg_eng / i));
            System.out.println("数学の平均点 = " + (avg_math / i));

        } catch (FileNotFoundException e) {
            System.err.println("File not Found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
