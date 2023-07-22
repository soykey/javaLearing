package lesson9;

import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(args[0]);
            br = new BufferedReader(fr);
            String i = null;
            int count = 1;
            while ((i = br.readLine()) != null){
                System.out.printf("%03d: ",count);
                count++;
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("IO error.");
        } finally {
            try {
                br.close();
            } catch (IOException e) {}
            catch (NullPointerException e){}
        }
    }
}
