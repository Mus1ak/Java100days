public class Solution {
    public static void main(String[] args) {
        int nums[] = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int maxProduct = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if( (nums[i]-1) * (nums[j]-1) > maxProduct ){
                    maxProduct = (nums[i]-1) * (nums[j]-1);
                }
            }
        }
        return maxProduct;
    }
}
