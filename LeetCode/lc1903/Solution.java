import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        String num = "7542351161";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        
        long max = Integer.MIN_VALUE;
        
        // int number = Integer.parseInt(num); //converting String to number
        long number = Long.parseLong(num);

        while(number>0){
            if(number%2!=0 && number>max) return String.valueOf(number); //converting number to string
            number /= 10;
        }
        
        return "";
    }
}