public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,4,10};
        // PrintSubarrays(arr);
        Maxnmin(arr);
    }

    public static void PrintSubarrays(int arr[]){
        //subarray - continuos part of an array
        //[2,4,6,8,10] 
        //subarrays -> 2,24,246,2468,246810 || 4,46,468,46810 .....

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    //Problem -> find the subarrays maximum and minimum sum 

    public static void Maxnmin(int arr[]){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0; 
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " -> " + sum + " ");
                    if(sum > max) max = sum;
                    if(sum < min) min = sum;
                }
                System.out.println();

            }
        }
        System.out.println("max -> "+max);
        System.out.println("min -> "+min);

    }
}
