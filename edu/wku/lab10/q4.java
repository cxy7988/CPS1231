package edu.wku.lab10;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.next();
        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValidPassword (String password){
        boolean bool = true;
        int total = 0;
        if (password.length() < 16) {
            bool = false;
        }
        for (int i = 0; i < password.length(); i++) {
            int char1 = password.charAt(i);
            if (char1 < 43 || (char1 > 43 && char1 < 48) || (char1 > 57 && char1 < 65) || (char1 > 90 && char1 < 97) || char1 > 122) {
                bool = false;
            }
            if (char1 >= 48 && char1 <= 57) {
                total += 1;
            }
        }
        if (total < 3) {
            bool = false;
        }
        return bool;
    }
}
