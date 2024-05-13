import java.util.Scanner;

public class question4 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        int length = str1.length();
        String str2 = "";
        System.out.println("The original string is " + str1);
        for (int i = length-1 ; i>=3; i--){
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("The diverse string is " + str2);

    }
}
