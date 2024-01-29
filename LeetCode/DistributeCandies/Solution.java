import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int candyTypes[] = {6,6,6,6};
        int candyTypes2[] = {1,1,2,2,3,3};
        int candyTypes3[] = {100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};


        System.out.println(disCandies(candyTypes));
        System.out.println(disCandies(candyTypes2));
        System.out.println(disCandies(candyTypes3));

    }   
    
    public static int disCandies(int[] candyType) {
        int canEat = candyType.length / 2;
        int count = 1;

        Arrays.sort(candyType);
    
        for (int i = 1; i < candyType.length && count < canEat; i++) {
            if (candyType[i] != candyType[i - 1]) {
                count++;
            }
        }

        return count;
    }
    
}
