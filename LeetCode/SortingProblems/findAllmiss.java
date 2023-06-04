import java.util.ArrayList;
import java.util.List;

public class findAllmiss {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 2, 1, 4, 4, 1 };
        System.out.println(sort(arr));
    }

    static List<Integer> sort(int arr[]) {
        List<Integer> missnums = new ArrayList<>();
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
                missnums.add(j + 1);
            }
        }
        return missnums;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
