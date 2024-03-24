import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {-1,2,4,-2,-2,-5};
        System.out.println(Kadens(arr));
    }

    public static boolean isNegative(int arr[]){
        //if all numbers are negative
        boolean isNeg = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                isNeg = true;
            }
        }
        return isNeg;
    }

    public static int Kadens(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        if(isNegative(arr)){
            Arrays.sort(arr);
            maxSum = arr[arr.length-1];
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                currSum = currSum + arr[i];
                if(currSum < 0) currSum = 0;
                //check
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}
