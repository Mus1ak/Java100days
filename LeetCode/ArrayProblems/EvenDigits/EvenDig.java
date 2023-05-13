import java.util.Arrays;

public class EvenDig {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int nums[]){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int countdig = 0;
            while(nums[i]>0){
                nums[i]/=10;
                countdig++;
            }
            if(countdig%2==0){
                count++;
            }
        }
        return count;
    }
}
