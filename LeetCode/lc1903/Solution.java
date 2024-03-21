import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        String num = "4206";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        String[] nums = num.split("");
        int max = 0;
        
        int arr[] = new int[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        for (int n : arr) {
            if(n%2!=0 && n>max){
                max = n;
                return String.valueOf(max);
            }
        }

        return "";
    }
}