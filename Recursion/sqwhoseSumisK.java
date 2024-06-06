class sqwhoseSumisK {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3};
        System.out.println(numSubseq(nums, 4));
    }

    public static int numSubseq(int[] nums, int target) {
        int sum = 0;
        int ind = 0;
        return helper(nums, target, sum, ind);
    }

    private static int helper(int nums[], int target, int sum, int ind){
        if(sum > target){
            return 0;
        }
        if(ind == nums.length){
            if(sum == target){
                return 1;
            }else return 0;
        }

        sum += nums[ind];
        //pick
        int l = helper(nums, target, sum, ind+1);

        sum -= nums[ind];
        //not pick
        int r = helper(nums, target, sum, ind+1);

        return  l + r;
        
    }
    
}