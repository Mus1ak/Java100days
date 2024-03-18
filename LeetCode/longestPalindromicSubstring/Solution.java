public class Solution {
    public static void main(String[] args) {
        System.out.println(LongPalSubstr("abababa"));
    }
    public static String LongPalSubstr(String s){
        int start = 0;
        int end = s.length() - 1;
        String temp = s.substring(start, end);
        // while (start<=end) {
        //     // if(temp.charAt(start) == temp.charAt(end)){

        //     // }
        // } 
        System.out.println(temp);
        return "";
    }
}
