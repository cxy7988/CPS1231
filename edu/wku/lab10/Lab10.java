package edu.wku.lab10;

public class Lab10 {
    public static int digitSum(int number){
        int sum = 0;
        while (number!=0){
            sum = number % 10 + sum;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        String input = "" + number;
        int length = input.length();
        boolean bool = true;
        for (int i=0; i<length; i++) {
            if(input.charAt(i)!=input.charAt(length-1-i)){
                System.out.println("This number is not palindrome");
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void computeSeries(int n){
        double result = 1.0/3;
        String output = "1/3";
        for (int i=2;i<=n;i++){
            result += i/(i+2.0);
            output = output + " + " + i +"/" +(i+2);
        }
        System.out.println("Series: " + result);
        System.out.println("Sum of the series: " + output);
    }

    public static boolean isValidPassword(String password){
        boolean bool = true;
        int total = 0;
        if (password.length()<16){
            bool = false;
        }
        for (int i=0;i<password.length();i++){
            int char1 = password.charAt(i);
            if (char1<43||(char1>43&&char1<48)||(char1>57&&char1<65)||(char1>90&&char1<97)||char1>122){
                bool = false;
            }
            if (char1>=48&&char1<=57){
                total +=1;
            }
        }
        if (total<3){
            bool = false;
        }
        return bool;
    }

    public static int Calculate(int input1, int input2){
        int result1;
        result1 = input1 - input2;
        return result1;
    }

    public static int Calculate(int input1){
        int result2;
        result2 = input1 * 2;
        return result2;
    }

    public static double Calculate(double input1, double input2){
        double result3;
        result3 = input1*input2;
        return result3;
    }

    public static String Calculate(String input1, String input2){
        String result4;
        result4 = input1 + input2;
        return result4;
    }

}
