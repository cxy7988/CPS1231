import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char ");
        String cha = input.next();
        switch (cha){
            case "a": System.out.println("Good");break;
            default:System.out.println("invalid input");
        }
    }
}
