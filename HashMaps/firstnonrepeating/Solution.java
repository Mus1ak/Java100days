import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,4,4,7};
        System.out.println(firstNonRepeating(nums));

    }   
    public static int firstNonRepeating(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                map.put(nums[i], temp+1);
            }
            else{
                map.put(nums[i],1);
            }
        } 
        //check the frequncy of each element if its 1 means it is non repeating
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    } 
}

//TIME COMPLEXITY - O(N);