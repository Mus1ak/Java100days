import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println(max_of_subarrays(arr, arr.length, 3));
    }
    public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;        
        //sliding window 
        for(int i=0; i<k; i++){
            al.add(arr[i]);
            max = Math.max(al.get(i), max);
        }
        list.add(max);
        
        for(int i=k; i<n; i++){
            al.remove(0);
            al.add(arr[i]);
            max = Math.max(al.get(al.size()-1), max);
            list.add(max);
        }
        return list;
    }
}
