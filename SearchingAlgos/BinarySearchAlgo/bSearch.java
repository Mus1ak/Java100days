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
            - Worst Case : O(log(N)) -> N : is the size of array
        */
        int arr[] = {1};
        Arrays.sort(arr);   //sorting array is needed for Binary 
        System.out.println(BinSearch(arr, 1));
        
    }
    static int BinSearch(int[]arr, int key){
            int start = 0;
            int end = arr.length - 1;

            while(start<=end){
                int mid = (start+end)/2; // might be possible if the values of (start+end) may exceed the range of int. so instead of doing this we can use     
                    //  mid = start + (end - start)/2
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