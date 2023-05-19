// public class SRotatedarray {
//     public static void main(String[] args) {
//         int nums[] = {5,1,3};
//         // int nums[] = {4,5,6,7,0,1,2};
//         int target = 5;
//         System.out.println(Search(nums, target));
//     }

//     static int peakElement(int[] nums) {
//         int s = 0;
//         int e = nums.length - 1;
//         while (s < e) {
//             int mid = s + (e - s) / 2;
//             if (nums[mid] > nums[e]) {
//                 s = mid + 1;
//             } else {
//                 e = mid;
//             }
//         }
//         return s;
//     }

//     static int Search(int[] nums, int target) {
//         int peakE = peakElement(nums);

//         if (nums[peakE] == target) {
//             return peakE;
//         }
//         int f = binSearch(nums, target, 0, peakE);
//         if (f != -1) {
//             return f;
//         }
//         return binSearch(nums, target, peakE + 1, nums.length - 1);
//     }

//     static int binSearch(int[] nums, int target, int s, int e) {
//         while (s <= e) {
//             int mid = s + (e - s) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 s = mid + 1;
//             } else {
//                 e = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
/* Second Approach */

public class SRotatedarray {
    public static void main(String[] args) {
        int arr[] = { 3,4,5,8,0,1,2 };
        int target = 0;

        // search for the pivot element
        // System.out.println(Pivot(arr));
        System.out.println(Search(arr, target));
    }

    static int Search(int[] nums, int target) {
        int pivotelement = Pivot(nums, 0, nums.length - 1);

        if(nums.length == 1 && nums[0] == target){
            return 0;
        }

        if (nums[pivotelement] == target) {
            return pivotelement;
        }
        if (pivotelement == -1) {
            return binSearch(nums, target, 0, nums.length - 1);
        }
        if (nums[0] <= target) {
            return binSearch(nums, target, 0, pivotelement - 1);
        }
        return binSearch(nums, target, Pivot(nums, 0, nums.length - 1) + 1, nums.length - 1);
    }

    static int binSearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = (s + e) / 2;
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

    static int Pivot(int nums[], int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = (s + e) / 2;
        // case 1: mid > m+1 in that case mid is the pivot
        if (mid < e && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        // case 2: mid < mid - 1 means mid - 1 is pivot
        else if (mid > s && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        }
        // case 3
        else if (nums[mid] <= s) {
            Pivot(nums, s, mid - 1);
        }

        // case 4

        return Pivot(nums, mid + 1, e);
    }
}