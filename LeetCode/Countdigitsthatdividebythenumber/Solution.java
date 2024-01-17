import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 1248;
        System.out.println(countDig(n));
    }
    public static int countDig(int num){
        int count = 0;
        //storing the original number in a new varible which will get changed
        int n = num;
        while (num > 0) {
            int lastDigit = num%10;
            //here we are checking if the last digit is divisible by the original number not the new variable we made earlier
            if(n%lastDigit == 0){
                //incrementing the count as soon as it is visible by the last digit
                count++;
            }
            num/=10;
        }
        return count;
    }
}
