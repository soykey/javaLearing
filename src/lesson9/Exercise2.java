package lesson9;

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            FileWriter fos = new FileWriter("sample.txt");
            bw = new BufferedWriter(fos);
            for (int i = 1; i <= 10; i++) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("IO Error.");
        } finally {
            try {
                bw.close();
            } catch (IOException | NullPointerException e) {}
        }
    }
}
