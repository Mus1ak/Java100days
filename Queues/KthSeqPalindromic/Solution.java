import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(KthSPalindromic(3));
    }

    public static String KthSPalindromic(int k){
        String res = "";
        Queue<String> q = new LinkedList<>();
        q.add("11");
        q.add("22");
        for (int i = 1; i <= k; i++) {
            String temp = q.remove();
            res = temp;

            //for splitting the number and adding 11 or 22 between them like ---> 1 11 1, 2 11 2
            String left = temp.substring(0, temp.length()/2);
            String right = temp.substring(temp.length()/2, temp.length());

            q.add(left + "11" + right);
            q.add(left + "22" + right);
        }
        return res;
    }
}
