import java.util.ArrayList;
import java.util.List;

public class findAlldup {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 3, 4, 6 };
        System.out.println(sort(arr));

    }

    static List<Integer> sort(int arr[]) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(j+1 != arr[j]){
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
