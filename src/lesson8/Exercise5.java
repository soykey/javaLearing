package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) {
        try {
            String arg = new BufferedReader(new InputStreamReader(System.in)).readLine();
            for (int i = arg.length()-1; i >= 0; i--) {
                System.out.print(arg.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
