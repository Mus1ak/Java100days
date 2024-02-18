public class Soltuion {
    public static void main(String[] args) {
        int nums[] = {2,9,31,-4,21,7};

        int k = 3;
        System.out.println(maxofsubarray(nums, k));
    }


    //naive approach 
    // public static int maxofsubarray(int[] nums, int k){
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length - k; i++) {
    //         int currSum = 0;
    //         for (int j = i; j < k+i; j++) {
    //             currSum += nums[j];
    //         }
    //         if (currSum > maxSum) {
    //             maxSum = currSum;
    //         }
    //     }
    //     return maxSum;
    // }

    //sliding window
    public static int maxofsubarray(int[] nums, int k){
            int maxSum = Integer.MIN_VALUE;
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += nums[i];
            }
            for (int i = k; i < nums.length; i++) {
                windowSum += nums[i] - nums[i-k];
                maxSum = Math.max(maxSum, windowSum);
                
            }
            return maxSum;
        }
}
