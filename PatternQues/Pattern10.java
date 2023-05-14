public class Pattern10 {

    /*
     * Input: N = 3
     * Output Pattern:
     * 
     ***
     ***** 
     ***** 
     ***
     * 
     */
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
