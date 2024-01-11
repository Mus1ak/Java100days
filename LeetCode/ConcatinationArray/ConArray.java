import java.util.Arrays;

public class ConArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums){
        int temp[] = new int[nums.length*2];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            temp[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            temp[index] = nums[i];
            index++;
        }
        return temp;
    }
}
