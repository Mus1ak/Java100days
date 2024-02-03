public class Solution {
    public static void main(String[] args) {
        int n = 77;
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
        int ans = 0;
        for(int i = 1; i<=Integer.MAX_VALUE; i++){
            if(i%2 == 0 && i%n == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
