import java.util.Arrays;

public class finddupandmis {
    public static void main(String[] args) {
        int arr[] = { 1, 1 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                return new int[] { arr[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
