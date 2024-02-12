public class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int a = 0;

        int b = 1;

        int c = 0;

        for (int i = 0; i < n; i++)
        {
            c = a + b;

            a = b;

            b = c;
        }

        return b;
    }

   
}
