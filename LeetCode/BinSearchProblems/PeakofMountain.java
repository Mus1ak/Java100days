public class PeakofMountain {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0 };

        System.out.println(Search(arr));
    }

    // using binary search to get the peak element in log(N) time complexity
    static int Search(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

}
