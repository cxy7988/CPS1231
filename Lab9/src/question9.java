import java.util.Scanner;

public class question9 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = scanner.nextInt();
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        if (number > 2) {
            System.out.print(number);
        }
    }
}
