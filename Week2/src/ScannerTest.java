import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        System.out.println("Input b");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a);
        System.out.println(b);
    }

}
