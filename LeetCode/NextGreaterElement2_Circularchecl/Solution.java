import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,5,10,5};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }   
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int res[] = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){
            while(!s.empty() && s.peek() <= nums[i]){
                s.pop();
            }
            if(s.empty()) res[i] = -1;
            else{
                res[i] = s.peek();
            }
            s.push(nums[i]);
        }


        //circular check
        for(int i=nums.length-1; i>=0; i--){
            while(!s.empty() && s.peek() <= nums[i]){
                s.pop();
            }
            if(s.empty()){
                if(res[i] == -1){
                    res[i] = -1;
                }
            }
            else{
                res[i] = s.peek();
            }
            s.push(nums[i]);
        }
        return res;
    } 
}
