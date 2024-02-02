public class Solution {
    public static void main(String[] args) {
        int n = 315;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n){
        int num = n;
        int sum = 0;
        int product = 1;
        while(num > 0){
            product *= num%10;
            sum += num%10;
            num/=10;
        }
        return (product - sum);
    }
}
