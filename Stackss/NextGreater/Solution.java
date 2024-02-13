import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        long[] arr = {1,3,2,4};
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));
        // System.out.println(nextLargerElement(arr, arr.length));
    }   
    public static long[] nextLargerElement(long[] arr, int n)
    {   
        long[] newarr = new long[arr.length];
        Stack<Long> st = new Stack<>();
        long element = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            //if the stack is empty just push the element into the stack
            if (st.empty()) {
                st.push(arr[i]);
                continue;
            }
            //if its not empty just check for the condition that if the current element of the stack is smaller than the next element or not if its is smaller than pop this element
            if(arr[i] > st.peek()){
                st.pop();
                element = st.push(arr[i]);
            }

        }

        System.out.println(element);
        
        return newarr;
    } 
}
