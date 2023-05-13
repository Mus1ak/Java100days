import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int twoD[][] = new int[3][3];
        
        //input
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = in.nextInt();
            }
        }

        //for output we can use foreach loop or the for loop like this
        //for loop
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < twoD.length; i++) {
            System.out.println(Arrays.toString(twoD[i]));
        }

        for (int[] a : twoD) {
            System.out.println(Arrays.toString(a));
        }
    }
}
