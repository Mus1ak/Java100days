public class Flooring {
    public static void main(String[] args) {
        // floor :- largest number in the array that is smaller than or equal to the target element.
        int arr[] = { 2, 3, 5, 7, 9, 10 };

        int target = 4;

        System.out.println(floornum(arr, target));
    }

    static int floornum(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }
}
