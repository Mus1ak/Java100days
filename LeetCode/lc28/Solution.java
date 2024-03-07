public class Solution {
    public static void main(String[] args) {
        String haystack = "marigold";
        String needle = "gold";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int i = 0; 
        int len = needle.length();
        int j = len;
        while(j<=haystack.length()){
            String sub1 = haystack.substring(i,j);
            if(needle.equals(sub1)){
                return i;
            }
            j++;
            i++;
        }
        return -1;
    }
}
