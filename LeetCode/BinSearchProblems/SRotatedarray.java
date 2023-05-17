public class SRotatedarray {
    public static void main(String[] args) {
        int nums[] = {5,1,3};
        // int nums[] = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(Search(nums, target));
    }

    static int peakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    static int Search(int[] nums, int target) {
        int peakE = peakElement(nums);

        if (nums[peakE] == target) {
            return peakE;
        }
        int f = binSearch(nums, target, 0, peakE);
        if (f != -1) {
            return f;
        }
        return binSearch(nums, target, peakE + 1, nums.length - 1);
    }

    static int binSearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
