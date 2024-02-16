import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is empty or has a single character (considered a palindrome)
        if (cleanedString.length() <= 1) {
            return true;
        }

        // Use two pointers to check if the string is a palindrome
        int start = 0;
        int end = cleanedString.length() - 1;

        while (start < end) {
            if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
        

    }
}
