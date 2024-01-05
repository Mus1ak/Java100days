import java.util.Arrays;

// class Revpartofarray{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         swap(arr, 3, 7);
//         System.out.println(Arrays.toString(arr));
//     }



//     public static void swap(int[] arr, int start, int end){
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

class Revpartofarray{
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7};
        
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        
    }
   

    public static int max(int[] arr){
        int count = 0;
        int maxel = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxel) {
                maxel = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (maxel != arr[i]) {
                count++;
            }
        }

        return count;
    }
}