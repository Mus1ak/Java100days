import java.util.Arrays;

//Kadens algorithm says that whenever you get a negative result after suming or we can say the final sum just put that as 0. and again use normal mathematical logic
// big -ve number + small +ve number = is always -ve so put 0,
// small -ve number + big +ve number = is always +ve so put the number which comes after sum, etc etc...

public class Solution {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Kadens(arr));
    }

    public static boolean isNeg(int[] arr) {
        for (int num : arr) {
            if (num >= 0) {
                return false; 
            }
        }
        return true; 
    }   

    public static int Kadens(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        if(isNeg(arr)){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0) currSum = 0;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
