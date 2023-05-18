import java.util.Arrays;

public class bininTwo {
    //algorithm for BINSEARCH IN 2D array
    /*
    [10,20,30]
    [22,25,33]
    [34,35,40]
    
    BinSearch(arr, target){
        low = 0;
        up = arr[i].length -1;
        while(low<up && up>=0){
            case 1: if(arr[i][j] == target)
                ans found
            case 2: if(arr[i][j] > target)
                up--;
            case 3: if(arr[i][j] < target)
                low++;
        }
        return [-1, -1] if nothing found
    }
    */
    public static void main(String[] args) {
        int arr[][] = {{10,20,30},{22,25,33},{34,35,40}};
        int target = 35;
        System.out.println(Arrays.toString(Search(arr, target)));
    }
    static int[] Search(int[][] arr, int target){
        int s = 0; // row
        int e = arr.length - 1; // col
        while(s<arr.length && e>=0){
            if (arr[s][e] == target) {
                return new int[]{s,e};
            }
            else if(arr[s][e] > target){
                e--;
            }
            else{
                s++;
            }
        }
        return new int[]{-1, -1};
    }
}
