public class Pattern2 {
    public static void main(String[] args) {
        /*
        Input: N = 3
        Output Pattern:  
        * 
        * * 
        * * *
        
        */ 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
