import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0,19};
        int n = arr.length;
        System.out.println(Leaders(arr, n));
    }   
    public static ArrayList<Integer> Leaders(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // loop until you tthe stack is not empty and the top element is less than currecnt element: if it meets the condition just pop that element 
            while (!st.empty() && st.peek() < arr[i]) {
                st.pop();
            }
            //else just push the current element if its empty or greater than the current element
            st.push(arr[i]);
        }
        // now we will add the elements that are on the stack basically the leaders .. in the array list with a while till the stack is empty
        while (!st.empty()) {
            al.add(st.pop());
        }
        //then reverse it using the collections interface as per the question 
        Collections.reverse(al);
        return al;
    } 
}
