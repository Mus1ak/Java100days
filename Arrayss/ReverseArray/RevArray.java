import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 31, 3, 1, 4 };
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            reversearray(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void reversearray(int arr[], int start, int end){
        //swapping is done here
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    

}
