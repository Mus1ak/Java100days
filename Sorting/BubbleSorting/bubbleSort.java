import java.util.Arrays;

public class bubbleSort {
    /*

    Bubble sort :-
    - In bubble sort we basically compare every adjacent element one by one till the lengh of the array.
    - in the first Pass we can see that the largest element is at the last index of the array.. same goes for the second largest which will in the second last index of the array.
    - means that the last indices get sorted first so we can ignore them in furthur pass of sorting by : j<arr.length - i;
    
    - Stable and unstable sorted - when the original array is maintained for the values that are equal --> statble sorted algorithm and vice versa..
    example : (black ball)10, (red ball)10 ,(black ball)27, (blackball)30

    - Time Complexity
        Best Case = O(N)
        Worst Case = O(N^2)
    */
    public static void main(String[] args) {
        int arr[] = {2,32,41,56,1,3};
        BubbleS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleS(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

}
