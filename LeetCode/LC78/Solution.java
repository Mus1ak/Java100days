import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int nums[]){

        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void helper(List<List<Integer>> result, List<Integer> output, int nums[], int ind){
        if(ind == nums.length){
            result.add(new ArrayList<>(output));
            return;
        }

        //pick
        output.add(nums[ind]);
        helper(result, output, nums, ind+1);

        //not pick
        output.remove(output.size()-1);
        helper(result, output, nums, ind+1);

    }
}
