

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        // PrintSubarrays(arr);
        System.out.println(MaxUsingPrefixSum(arr));
    }

    public static int MaxUsingPrefixSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];

        //prefix-calculation
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                //prefix[end] - prefix[start - 1]
                currSum = i == 0? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum) maxSum = currSum;
            }
        }
        return maxSum;
    }

}
