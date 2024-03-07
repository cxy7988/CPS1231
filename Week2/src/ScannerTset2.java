import java.util.Scanner;
public class ScannerTset2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        System.out.println("Input b");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(a/b);
    }
}
