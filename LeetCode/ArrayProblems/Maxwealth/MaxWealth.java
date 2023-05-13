import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = { { 1, 2 }, { 3, 4 }, { 2, 5 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum += accounts[i][j];
            }
            sum[i] = rowSum;
            if (max < sum[i]) {
                max = sum[i];
            }
        }
        return max;
    }
}
