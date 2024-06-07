import java.util.*;
public class CombinationSum1 {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        int target = 4;

        System.out.println(CombinationS1(nums, target));
    }
    public static List<List<Integer>> CombinationS1(int nums[], int target){
        List<List<Integer>> result = new ArrayList<>();

        helper(0,nums,target, result, new ArrayList<>());
        return result;
    }

    private static void helper(int ind, int nums[], int target,List<List<Integer>> result, List<Integer> temp ){
        //base case
        if(ind == nums.length){
            if(target == 0){
                result.add(new ArrayList<>(temp));
                return;
            }
            return;
        }

        if(nums[ind] <= target){
            temp.add(nums[ind]);
            helper(ind, nums, target - nums[ind], result, temp);
            temp.remove(temp.size() - 1);
        }
        helper(ind+1, nums, target, result, temp);
    }
    
}
