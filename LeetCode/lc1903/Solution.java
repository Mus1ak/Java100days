import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        String num = "524290740297509725075247274982472874029749";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        
        int max = Integer.MIN_VALUE;
        
        String[] numarr = num.split("");
        if(Integer.parseInt(numarr[numarr.length-1]) % 2 != 0){
            return num;
        }

        int number = Integer.parseInt(num); //converting String to number
        // long number = Long.parseLong(num);
        

        while(number>0){
            if(number%2!=0 && number>max) return String.valueOf(number); //converting number to string
            number /= 10;
        }
        
        return "";
    }
}