
public class Solution {
    public static void main(String[] args) {
        String s = "Mubarak Ramadan everyone";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        String[] arr = s.split(" ");
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String res = String.join(" ",arr);
        return res;
    }
}
