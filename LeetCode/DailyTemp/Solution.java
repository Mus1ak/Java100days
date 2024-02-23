import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
     public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int res[] = new int[temperatures.length];

        for(int i=temperatures.length-1; i>=0; i--){
            while(!s.empty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            if(s.empty()) res[i] = 0;
            else{
                res[i] = s.peek() - i;
                
            }
            s.push(i);
        }
        return res;
    }
}
