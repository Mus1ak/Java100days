
public class Ceiling {
    public static void main(String[] args) {
        // ceil : smallest element in the array that is greater than or equal to the
        // target element
        int arr[] = {2,3,5,7,9,10};

        int target = 8;

        System.out.println(ceilnum(arr, target));
    }

    static int ceilnum(int[] arr, double target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
