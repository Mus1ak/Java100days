import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "(()))()";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;

        st.push(-1);
        for(int i=0; i<s.length(); i++){
            
            //push in stack
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }else{
                    int len = i - st.peek();
                    max = Math.max(max, len);
                }
            }
            
        }
        return max;
    }
}
