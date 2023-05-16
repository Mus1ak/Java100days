public class InfiniteArr {
    public static void main(String[] args) {
        // find the position of the target element in a sorted infinite array
        int arr[] = { 1, 2, 4, 6, 9, 15, 17, 22, 27, 30, 33, 35 };
        int target = 6;
        // we are assuming that given array is finite and we will not use the arr.lenght
        // since its infinite so we will just search it in chunks/parts
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int temp = end + 1;
            /*
             * doubling the size of the box or chunk
             * - end = end + (start + end)*2
             */
            end = end + (start + end)*2;
            start = temp;
        }
        return Search(arr, target, start, end);
    }

    static int Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
