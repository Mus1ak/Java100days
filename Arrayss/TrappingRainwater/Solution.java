import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(trapRain(height));
    }

    public static int trapRain(int height[]){
        int trappedWater = 0;
        //Auxilary array
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        //trapped water = (water level above that bar - height of bar) * width of bar
        for (int i = 0; i < height.length; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        
        }

        return trappedWater;

    }
}
