import java.lang.reflect.Array;
import java.util.Arrays;

public class CountTrailing {
    // public static void main(String[] args) {
    //     int num = Fact(1);
    //     System.out.println(countDig(num));
    // }

    // public static int countDig(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         int rem = n % 10;
    //         if (rem == 0) {
    //             count++;
    //         }
    //         n = n / 10;
    //     }
    //     return count;
    // }

    // public static int Fact(int n) {
    //     if (n <= 1) {
    //         return 1;
    //     }
    //     return n * Fact(n - 1);
    // }



    public static void main(String[] args) {
        int[] arr= {1,2,3,515,6,4};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rev(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
