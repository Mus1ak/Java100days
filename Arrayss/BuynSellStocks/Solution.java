import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int prices[] = {7,1,5,7,6,4};
        // System.out.println(buyandSellStocks(prices));
        System.out.println(Arrays.toString(buyandSellStocks(prices)));
    }
    public static int[] buyandSellStocks(int[] prices){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int sellday = 0;
        int buyday = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellPrice = prices[i];
            if(buyPrice < sellPrice){
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
                sellday++;
                
            }else{
                buyPrice = sellPrice;
                buyday++;
            }
        }

        return new int[]{buyday, sellday};
    }
}
