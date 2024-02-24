import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {

        // using arraylist - 18ms
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(!al.contains(nums[i])) al.add(nums[i]);
        }
        for(int j=0; j<al.size(); j++){
            nums[j] = al.get(j);
        }
        return al.size();

    }
}
