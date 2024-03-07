import java.util.Scanner;
public class InputTest {
    public static void main(String[] args){
        // create a scanner objects
        Scanner input = new Scanner(System. in);

        System.out.print("Enter here");
        double radius = input.nextDouble();

        //print out
        System.out.print(radius);
    }
}
