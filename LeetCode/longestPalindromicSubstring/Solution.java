
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        System.out.println(LongPalSubstr("cbbd"));
    }
    public static String LongPalSubstr(String s){
        if(s.length() <= 1){
            return s;
        }

        String LPS = "";

        for (int i = 1; i < s.length(); i++) {
            int low = i;
            int high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }

            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()) LPS = palindrome;

            //even 
            low = i-1;
            high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()) LPS = palindrome;

        }
        return LPS;
    }

}
