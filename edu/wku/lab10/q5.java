package edu.wku.lab10;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int input1 = scanner.nextInt();
            System.out.println("Do you want continue to input integer. Input integer or no");
            if (scanner.hasNextInt()){
                int input2 = scanner.nextInt();
                System.out.println(minus(input1,input2));
            }
            else{
                System.out.println(plus(input1));
            }
        }
        else if(scanner.hasNextDouble()){
            double input1 = scanner.nextDouble();
            if (scanner.hasNextDouble()){
                double input2 = scanner.nextDouble();
                System.out.println(multiple(input1,input2));
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if(scanner.hasNext()){
            String input1 = scanner.next();
            if (scanner.hasNext()){
                String input2 = scanner.next();
                System.out.println(concatenation(input1,input2));
            }
            else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public static int minus(int input1,int input2){
        int result;
        result = input1 - input2;
        return result;
    }

    public static int plus(int input1){
        int result;
        result = input1 * 2;
        return result;
    }

    public static double multiple(double input1, double input2){
        double result;
        result = input1*input2;
        return result;
    }

    public static String concatenation(String input1, String input2){
        String result;
        result = input1 + input2;
        return result;
    }
}
