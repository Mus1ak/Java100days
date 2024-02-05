public class Solution {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int count = 0;        
        if (num % 2 == 1) {
            num = num - 1;
            count++;
        }
        
        if (num == 0) {
            return count;
        }
        count++; 
        return count + numberOfSteps(num / 2);
    }
}
