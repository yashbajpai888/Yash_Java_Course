package ZPrac;

import java.util.Scanner;

public final class prac {
    public static void main(String[] args) {
        int val;

        System.out.println("Table:");
        Scanner s = new Scanner(System.in);
        val = s.nextInt();

        for (int i = val; i <= val + 10; i++) {
            System.out.println(i);
        }
        
        // Close the scanner to release resources
        s.close();
    }
}
