

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,6,5,1,5,2,1};
        System.out.println(maxProfit(prices));
    }  


    //brute force - O(n2)
    /* public static int maxProfit(int[] prices) {
        int diff = 0;
        int start = 0; 
        int end = start + 1;
        while(start < prices.length){
            while(end < prices.length){
                int temp = prices[end] - prices[start];
                if(temp > 0 && diff < temp){
                    diff = temp;
                    
                }
                end++;
            }
            start++;
            end = start;
        }
        return diff;
    } 
    */
    
    //optimized - O(n)
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i : prices) {
            minPrice = Math.min(i, minPrice);
            maxProfit = Math.max(maxProfit, i-minPrice);
        }
        return maxProfit;
    }
}
