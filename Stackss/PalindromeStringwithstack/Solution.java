import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "sdfsdfsdff";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        boolean ans = true;

        for (int i = 0; i < s.length(); i++) {
            if (st.pop() != s.charAt(i)) {
                ans = false; 
                break; 
            }
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
