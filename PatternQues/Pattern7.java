public class Pattern7 {
    public static void main(String[] args) {
        /*
        Input: N = 3
        Output Pattern:  
          *  
         * *
        * * * 
        * * *  
         * *
          *   
        */
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
