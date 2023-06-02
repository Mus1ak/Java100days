/*
Selection sort is nothing but we just select an element from the array or whattever and then put it ints right position.

Time Complexity
Worst Case : O(n^2)
Best Case : O(n^2)
*/

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {12,2,1,6};
        SelSort(arr);
        System.out.print(Arrays.toString(arr));   
    }
    static void SelSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxInd = max(arr, 0, last);
            swap(arr, maxInd, last);
        }
    }
    static int max(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }  
    static void swap(int arr[], int s , int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
