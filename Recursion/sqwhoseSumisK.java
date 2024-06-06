import java.util.*;

class sqwhoseSumisK {
    public static void main(String[] args) {

        int nums[] = {1,1,2,3};
        System.out.println(numSubseq(nums, 4));
    }

    public static List<List<Integer>> numSubseq(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>(); 
        int sum = 0;
        int ind = 0;
        helper(nums, target, sum, ind, output, new ArrayList<>());
        return output;
    }

    private static void helper(int nums[], int target, int sum, int ind, List<List<Integer>> output, List<Integer> res){
        if(sum > target){
            return;
        }
        if(ind == nums.length){
            if(sum == target){
                //adding the copy of res to output as lists in java are mutable they can be changed
                output.add(new ArrayList<>(res));
                return;
            }else return;
        }
        res.add(nums[ind]);
        sum += nums[ind];
        //pick
        helper(nums, target, sum, ind+1, output, res);

        res.remove(res.size() - 1);
        sum -= nums[ind];
        //not pick
        helper(nums, target, sum, ind+1, output, res);


        //to count we just simple add the recursive funcions
        // return  l + r;
        
    }
    
}