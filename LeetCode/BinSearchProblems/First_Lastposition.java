import java.util.Arrays;

public class First_Lastposition {
    public static void main(String[] args) {
        int nums[] = { 1, 6, 7, 7, 8, 9, 10 };
        int target = 7;
        int pos[] = Search(nums, target);
        System.out.println(Arrays.toString(pos));
    }
    /*
    static int[] Search(int[] nums, int target) {
    int fP = -1;
    int lP = -1;
    int i = 0;
    while (i < nums.length) {
    if (nums[i] == target) {
    if (fP == -1) {
    fP = i;
    }
    lP = i;
    }
    i++;
    }
    return new int[] { fP, lP };
    }
     */
    /*
    Better time complexity method is using binary search():
    - first as it says find the first position and last position we will divide
    it and will find the first position of the element first and then the last
    position using binary search O(logN) time complexity
    - so when element is found we will check if theres any other element that is
    on the left side for the first position so will do : e = mid - 1
    - similarly for last position after finding the index of the element we will
    check for any other possible position of that element on the right side by
    doing : s = mid+1
    - rest of the code is same as binary search.
    --------------------------------------------------------------------
     * Code :
     */

    static int[] Search(int[] nums, int target) {
        int fP = binSearchL(nums, target);
        int lP = binSearchR(nums, target);
        return new int[] { fP, lP };
    }

    // function to find the left most or first position of the element
    static int binSearchL(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    // function to find the right most or last position of the element
    static int binSearchR(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

}
