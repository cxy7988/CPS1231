public class question10 {
    public static void main(String[] arg) {
        for (int j = 1; j<7; j++) {
            for (int i = 12-2*j; i > 0; i--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= j*2-1; m++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int a = 1; a<6; a++){
            for (int b = 1; b<=2*a; b++){
                System.out.print(" ");
            }
            for (int c = 1; c<=11-2*a; c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
