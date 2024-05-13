import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int begin = input.nextInt();
        int end = input.nextInt();
        if (begin > end){
            int temp = begin;
            begin = end;
            end = temp;
        }
        while (begin <= end){
            if (begin % 2 == 0) {
                System.out.println("The even value is " + begin);
                begin = begin + 2;
            }
            else {
                begin = begin + 1;
            }
        }
    }
}
