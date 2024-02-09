
public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,15,25,45,42,21,17,12,11};
        System.out.println(findMaximum(arr, arr.length));
    }
    public static int findMaximum(int[] arr, int n) {
        int max = arr[0];
        int diff = 0;
        for(int i=0; i<n-1; i++){

            if (arr[i] <= arr[i+1]) {
                max = arr[n-1];
            }

           else{
                diff = arr[i+1] - arr[i];
                if(diff < 0){
                    max = arr[i];
                    break;
                }
           }
        }
        return max;
    }
}
