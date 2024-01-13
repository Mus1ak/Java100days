import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(runSum(arr)));
    }

    public static int[] runSum(int[] arr){
        int ans[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans[i] = sum;
        }
        return ans;
    }
}
