public class Solution {
    public static void main(String[] args) {
        int nums[] = {5,6,7,1,2,3};
        System.out.println(searchInRotatedArray(nums, 2));
    }   
    
    public static int searchInRotatedArray(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
