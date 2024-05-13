import java.util.Scanner;

public class question5 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 0; i<row; i++){
            for (int n = row; n>0; n--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");


        for (int i = 0; i<row; i++){
            for (int n = -1; n < i; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");


        for (int i = 0; i<row; i++){
            for (int n = row-i; n>0; n--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");


        for (int i = 0; i<row; i++){
            for (int n = row-i-1; n>0; n--){
                System.out.print(" ");
            }
            for (int n = -1; n < i; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");


        for (int i = 0; i<row; i++){
            for (int n = 0; n<i; n++){
                System.out.print(" ");
            }
            for (int n = row-i; n>0; n--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
