//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {2,5,6,9};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {

        // brute force
        // for(int i=0; i<numbers.length;i++){
        //     for(int j = i+1; j<numbers.length; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        //optimal solution
            int start = 0;
            int end = numbers.length - 1;
            while(start < end){
                if(numbers[start] + numbers[end] == target) return new int[]{start+1, end+1};
                else if(numbers[start] + numbers[end] < target)  start++;
                else end--;
            }
            return new int[]{};
        }
}
