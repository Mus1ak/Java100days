import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateTemp(36.50)));
    }   
    
    public static double[] calculateTemp(double celsius){
        double ans[] = {(celsius + 273.15), ((celsius * 1.80) + 32.00) };
        return ans;
    }
}
