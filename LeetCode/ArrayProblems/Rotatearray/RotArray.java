import java.util.Arrays;

public class RotArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,12,31,27};
        int n = arr.length;
        int k = 31;
        rotate(arr, k, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k, int n){
        k = k%n;
        swap(arr, 0,n-1);
        swap(arr, 0, k-1);
        swap(arr, k, n-1);
    }

    public static void swap(int[] arr, int s, int e){
        int st = s;
        int en = e;

        while (st<en) {
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
    }
}
