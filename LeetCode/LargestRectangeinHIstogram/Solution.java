import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] leftMin = new int[heights.length];
        int[] rightMin = new int[heights.length];
        int ans = 0;

        //smallest element on the left
        for(int i=0; i<heights.length; i++){
            while(!st.empty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            leftMin[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        while(!st.empty()) st.pop();
        
        //smallest element on the right
        for(int i=heights.length-1; i>=0;i--){
            while(!st.empty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.empty()) rightMin[i] = -1;
            rightMin[i] = st.empty() ? heights.length : st.peek();
            st.push(i);
        }

        for(int i=0; i<heights.length; i++){
            ans = Math.max(ans, heights[i]*(rightMin[i] - leftMin[i] - 1));
        }

        return ans;

    }
}
