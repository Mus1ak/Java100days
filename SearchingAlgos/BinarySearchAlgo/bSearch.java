import java.util.Arrays;
public class bSearch{
    public static void main(String[] args) {
        /*
        - Binary Search : its a searching algorithm that is used to find the position of a target value in a sorted array. 
        - In linear Search We are iterating through all the elements of the array individually and searching if the target value is present or not.
        - But in Binary Search we divide the array in two parts and check if the target value is either small or larger than the mid value if it lies within the range (lets say it is larger than the mid value then we change the start to mid and divide it again ..and so on)

        - Algorithm
        BinSearch(arr, key){
            int start = 0;
            int end = arr.length - 1;
            while(start<end){
                int mid = (start+end)/2;
                if(key == arr[mid]){
                    return mid;
                }
                else if(key>arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }

        - Time Complexity
            - Best Case: when the middle element is equal to key in the first comparison , Time Complexity : O(1)
            - Worst Case : O(N/2)
        */
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(BinSearch(arr, 6));
        
    }
    static int BinSearch(int[]arr, int key){
            int start = 0;
            int end = arr.length - 1;

            while(start<=end){
                int mid = (start+end)/2;
                if(arr[mid] == key){
                    return mid;
                }
                else if(arr[mid]<key){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
                System.gc();
            }return -1;
        }
}