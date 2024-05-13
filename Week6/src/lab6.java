import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year number ");
        int year = input.nextInt();
        System.out.print("Enter a Month number ");
        int month = input.nextInt();
        if (year % 4 == 0) {
            switch (month) {
                case 1:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 2:
                    System.out.println(month + " " + year + "has 29 days");
                    break;
                case 3:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 4:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 5:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 6:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 7:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 8:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 9:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 10:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 11:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 12:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                default:
                    System.out.println("invaild input");
            }
        } else {
            switch (month) {
                case 1:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 2:
                    System.out.println(month + " " + year + "has 28 days");
                    break;
                case 3:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 4:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 5:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 6:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 7:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 8:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 9:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 10:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                case 11:
                    System.out.println(month + " " + year + "has 30 days");
                    break;
                case 12:
                    System.out.println(month + " " + year + "has 31 days");
                    break;
                default:
                    System.out.println("invaild input");
            }
        }
    }
}
