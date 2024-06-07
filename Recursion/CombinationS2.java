import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationS2 {

    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        int target = 4;

        System.out.println(combinationSum22(nums, target));
    }


    public static List<List<Integer>> combinationSum22(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }
    private static void helper(int[] arr, int target, List<List<Integer>> result, List<Integer> temp, int ind){
        // Arrays.sort(arr);
        // if(ind == arr.length){
        //     if (target == 0 && !result.contains(temp)){
        //         result.add(new ArrayList<>(temp));
        //     }
        //     return;
        // }

        // if(arr[ind] <= target){
        //     temp.add(arr[ind]);
        //     helper(arr, target - arr[ind], result, temp, ind+1);
        //     temp.remove(temp.size() - 1);
        // }
        // helper(arr, target, result , temp , ind+1);


        //optimized
        Arrays.sort(arr);

        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            temp.add(arr[i]);
            helper(arr, target - arr[i], result , temp, i+1);
            temp.remove(temp.size() - 1);

        }

    }
}
