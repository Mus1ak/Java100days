import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "abbabababbae";
        // System.out.println(Arrays.toString(dup(s)));
        System.out.println(dup(s));

    }   
    public static String dup(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (st.size() == 0) {
                st.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == st.peek()) {
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        char[] arr = new char[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return new String(arr);
    } 
}
