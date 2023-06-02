import java.util.Arrays;

/*
Time Complexity
Best Case - O(N)
Worst Case - O(N^2)
*/
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 31, 4, 1, 5, 7 };
        inSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void inSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
