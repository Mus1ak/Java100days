public class Pattern1 {
    public static void main(String[] args) {
        /*
        Input: N = 3
        Output Pattern:  
        * * *
        * * *
        * * * 
        */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
