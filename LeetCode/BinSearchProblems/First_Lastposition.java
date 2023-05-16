import java.util.Arrays;

public class First_Lastposition {
    public static void main(String[] args) {
        int nums[] = { 1, 6, 7, 7, 8, 9, 10 };
        int target = 12;
        int pos[] = Search(nums, target);
        System.out.println(Arrays.toString(pos));
    }

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
}