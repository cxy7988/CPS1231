import java.util.Scanner;

public class question3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number;
        boolean prime = true;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("The number is a positive integer.");
                for (int i = number - 1; i > 1; i--) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println("It is prime number");
                }
                else {
                    System.out.println("It is not prime number");
                }
            } else {
                System.out.println("The number is not a positive integer.");
            }
        }
        else {
            System.out.println("The input is not an integer.");
        }
    }
}



