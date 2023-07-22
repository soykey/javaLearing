//package report2;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Objects;
//
//class Student {
//    private String name=null;
//    private int score_eng=0;
//    private int score_math=0;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setScoreEng(int score_eng) {
//        this.score_eng = score_eng;
//    }
//
//    public void setScoreMath(int score_math) {
//        this.score_math = score_math;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getScoreEng() {
//        return score_eng;
//    }
//
//    public int getScoreMath() {
//        return score_math;
//    }
//
//    public void print() {
//        System.out.println();
//        System.out.println("氏名 -> " + this.getName());
//        System.out.println("英語 -> " + this.getScoreEng() + "点");
//        System.out.println("数学 -> " + this.getScoreMath() + "点");
//        System.out.println();
//    }
//}
//
//public class Exercise3 {
//    public static void main(String[] args) {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//
//        int avg_eng = 0;
//        int avg_math = 0;
//        int i = 0;
//
//        Student[] st = new Student[10000];
//
//        System.out.println("名前に\"END\"と入力すると入力を終了して各科目の平均点を出力します");
//
//        try {
//            while (true) {
//                st[i] = new Student();
//                System.out.print((i + 1) + "人目の名前を入力してください -> ");
//                String name = br.readLine();
//                if (Objects.equals(name, "END")) {
//                    break;
//                } else {
//                    st[i].setName(name);
//                }
//
//                System.out.print((i + 1) + "人目の英語の点数を入力してください -> ");
//                int eng = Integer.parseInt(br.readLine());
//                avg_eng += eng;
//                st[i].setScoreEng(eng);
//
//                System.out.print((i + 1) + "人目の数学の点数を入力してください -> ");
//                int math = Integer.parseInt(br.readLine());
//                avg_math += math;
//                st[i].setScoreMath(math);
//
//                i++;
//
//                System.out.println();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (int j = 0; j < st.length; j++) {
//            if (st[j].getName()==null){break;};
//            st[j].print();
//        }
//
//        System.out.println("英語の平均点 = "+(avg_eng/i)+"点");
//        System.out.println("数学の平均点 = "+(avg_math/i)+"点");
//    }
//}
