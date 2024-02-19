import java.util.Stack;

public class Solution{
    public static void main(String[] args) {
        int pushed[] = {1,2,3,4,5};
        int popped[] = {4,5,3,1,2};
        System.out.println(validateStackSequences(pushed, popped));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int index = 0;
        for (int i = 0; i < popped.length; i++) {
            st.push(pushed[i]);
            while (!st.empty() && st.peek() == popped[index] ) {
                st.pop();
                index++;
            }
        }
        if (st.empty()) {
            return true;
        }else{
            return false;
        }
        
    }
}