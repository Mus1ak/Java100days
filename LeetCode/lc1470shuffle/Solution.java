import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,3,2,1};
        int n =4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int newArr[] = new int[nums.length];
        int halfn = nums.length - n;
        for (int i = 0; i < nums.length; i++) {
            if (i%2!=0) {
                newArr[i] = nums[halfn];
                halfn++;
            }
            else{
                newArr[i] = nums[halfn - n];
            }
        }
        return newArr;
    }
}
