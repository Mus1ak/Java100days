

public class Solution {
    public static void main(String[] args) {
        int hours[] = {1,3,4,5};
        int target = 2;
        System.out.println(numofHOurs(hours, target));
    }

    public static int numofHOurs(int[] hours, int target){
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

}
