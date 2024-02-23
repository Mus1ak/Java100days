

public class Solution{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isStrictlyPalindromic(n));
    }

    public static boolean isStrictlyPalindromic(int n) {
        int base = 2;
        boolean isPal = false;

        while (base < n - 1) {
            int res = 0;
            int multiplier = 1;
            int num = n;
            while (num > 0) {
                int rem = num%base;
                res += rem * multiplier;
                num = num/base;
                multiplier *= 10;
            }
            base++;
            int ognum = res;
            int revnum = 0;
            
            //checking if the num is palindrome of not
            while (ognum > 0) {
                int rem = ognum%10;
                revnum = revnum * 10 + rem;
                ognum/=10;
            }

            if (res == revnum) {
                isPal = true;
            }else{
                isPal = false;
            }
        }
        return isPal; 
    }

    
}