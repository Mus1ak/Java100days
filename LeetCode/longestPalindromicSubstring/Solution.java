/*
 * Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer......

Input: s = "racecar"
Output: "racecar"
 */


import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        System.out.println(LongPalSubstr("racecar"));
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
        System.gc();
        return LPS;
    }

}
