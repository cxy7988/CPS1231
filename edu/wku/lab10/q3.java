package edu.wku.lab10;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        computeSeries(number);
    }


    public static void computeSeries(int n) {
        double result = 1.0 / 3;
        String output = "1/3";
        for (int i = 2; i <= n; i++) {
            result += i / (i + 2.0);
            output = output + " + " + i + "/" + (i + 2);
        }
        System.out.println("Series: " + result);
        System.out.println("Sum of the series: " + output);
    }
}

