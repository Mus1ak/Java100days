public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println(searchInsert(nums, 3));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(target == nums[mid]) index = mid;
            if(target < nums[mid]){
                end = mid - 1;
                index = start ;
            }
            else{
                start = mid + 1;
                index = start;
            }
        }
        return index;
    }
}
