import java.util.Scanner;
public class question6 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        if (a%b == 0){
            System.out.println("GCD is"+b);
        }
        else {
            while (a % b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            System.out.println("GCD is " + b);
        }
    }
}
