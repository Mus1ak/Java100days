import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        String num = "29283276444787797987978999999999777995526";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        
        // long max = Integer.MIN_VALUE;
        
        // String[] numarr = num.split("");
        // if(Integer.parseInt(numarr[numarr.length-1]) % 2 != 0 || Integer.parseInt(numarr[numarr.length-2]) % 2 != 0 || Integer.parseInt(numarr[numarr.length-3]) % 2 != 0){
        //     return num;
        // }

        // long number = Long.parseLong(num); //converting String to number
        // // long number = Long.parseLong(num);
        

        // while(number>0){
        //     if(number%2!=0 && number>max) return String.valueOf(number); //converting number to string
        //     number /= 10;
        // }
        
        // return "";


        //optimized
        for (int i = num.length() - 1; i >= 0; i--) {
            // Convert the character at the current index to an integer
            int dig = num.charAt(i) - '0';

            if((dig & 1) == 1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}