public class insertPos {
    /*Question Link: https://leetcode.com/problems/search-insert-position/ */
    public static void main(String[] args) {
        int arr[] = {1,2,5,525,15161};
        int target = 4;
        System.out.print(Search(arr, target));
    }
    static int Search(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        int mid = (s + e) / 2;
        while (s <= e) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = (s + e) / 2;
        }
        if(arr.length == 0){
            return 0;
        }
        if (target <= 1) {
            return s;
        }
        return mid + 1;
    }
}
