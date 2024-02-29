import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int nums1[] = {2,7,1,3};
        int nums2[] = {4,2,7,0};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
           set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }

        int[] arr = new int[Math.min(set.size(), set2.size())];
        int index = 0;
        for(int num : set2){
            if(set.contains(num)){
                arr[index++] = num;
            }
        }

        //Arrays.copyOf(arr, index) : is to trim the array to original size
        return Arrays.copyOf(arr, index);

    }
}
