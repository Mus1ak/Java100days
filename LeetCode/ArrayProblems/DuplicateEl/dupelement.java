import java.util.*;

public class dupelement {
    public static void main(String[] args) {
        int arr[] = {1,12,1,4,15,1,66,1,6,4,31,4};
        System.out.println(isDup(arr));
        
    }
    public static boolean isDup(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }
}
