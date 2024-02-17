import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
        // reverseWords(S);
    } 
    public static String reverseWords(String S)
    {   
        String[] splitted = S.split("\\.");
        int start = 0;
        int end = splitted.length - 1;
        while(start < splitted.length/2){
            String temp = splitted[start];
            splitted[start] = splitted[end];
            splitted[end] = temp;
            start++;
            end--;
        }
        String revResult = String.join(".", splitted);

        return revResult;
    }       
}
