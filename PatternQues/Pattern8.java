public class Pattern8 {
    /*
        Input: N = 3
        Output Pattern:  
          * 
        * * *
      * * * * * 
        */
        public static void main(String[] args) {
            int n = 3;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= (n-i)-1 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2*i-1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
