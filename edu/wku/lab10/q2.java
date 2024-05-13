package edu.wku.lab10;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input1 = scanner.nextInt();
        isPalindrome(input1);
    }

    public static void isPalindrome(int number) {
        String input2 = number + "";
        int length = input2.length();
        boolean bool = true;
        for (int i = 0; i < length; i++) {
            if (input2.charAt(i) != input2.charAt(length - 1 - i)) {
                System.out.println("This number is not palindrome");
                bool = false;
                break;
            }
        }
        if (bool) {
            System.out.println("This number is palindrome");
        }
    }
}
