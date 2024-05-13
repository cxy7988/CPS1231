import java.util.Scanner;

public class question7 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive integer:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean prime = true;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = b; i <= a; i++){
            for (int m = i - 1; m > 1; m--) {
                if (i % m == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
            prime = true;
        }
    }

}
