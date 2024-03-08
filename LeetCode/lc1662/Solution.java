public class Solution {
    public static void main(String[] args) {
        String[] word1 = {"ds","a"};
        String[] word2 = {"d","s","a"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1)).equals(String.join("", word2));
    }
}
