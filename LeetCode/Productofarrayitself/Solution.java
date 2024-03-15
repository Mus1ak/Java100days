import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-69,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    //brute force
    public static int[] productExceptSelf(int[] nums) {
        // int res[] = new int[nums.length];            
        // for(int i=0; i<nums.length; i++){
        //     int product = 1;
        //     for(int j=0; j<nums.length; j++){
        //         if(i!=j){
        //             product*=nums[j];
        //         }
        //     }
        //     res[i] = product;    
        // }
        // return res;

        //optimal
        int res[] = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length; i++){
            res[i] = product;
            product*=nums[i];            
        }
        product = 1;
        for(int i=nums.length - 1; i>=0;i--){
            res[i] *= product;
            product*=nums[i];
        }

        return res;
    }
}
