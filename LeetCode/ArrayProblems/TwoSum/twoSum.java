import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {67,67,67,3,67,67,8};
        int result[] = twoS(arr, 70);

        System.out.println(Arrays.toString(result));
    }   
    public static int[] twoS(int[] arr, int k){
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i]>k)) {
                for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j] == k) {
                    return new int[]{i,j};
                }
            }
            }
        }
        return new int[]{-1,-1};
    } 
}
