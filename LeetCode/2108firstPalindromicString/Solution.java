public class Solution {
    public static void main(String[] args) {
        String[] words = {"dasa", "race", "miami", "ada"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words){
        for (String word : words) {
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
