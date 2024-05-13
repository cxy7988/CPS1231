package edu.wku.lab10;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the digits is: " + digitSum(number));
    }


    public static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = number % 10 + sum;
            number /= 10;
        }
        return sum;
    }
}
