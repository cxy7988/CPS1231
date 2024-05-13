public class question8 {
    public static void main(String[] arg) {
        for(int i = 1; i< 10; i++){
            for(int n = 18-2*i;n>0;n--){
                System.out.print(" ");
            }
            for(int m = i;m>0;m--){
                System.out.print(m+" ");
            }
            for(int j = 2;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
