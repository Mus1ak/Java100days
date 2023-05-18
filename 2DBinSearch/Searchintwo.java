import java.util.Arrays;
public class Searchintwo {
    //its a normal linear search in two D matrix
    /*
    - first we have a given matrix
    - and a target element that we have to search for in the matrix
    - we create a function call Search() that takes arguments:
        - array
        - the target element
    - we apply for loop for iterating throught the matrix.
    - first loop is for the row to the lenght of the row.
    - second for loop is for the column to the lenght of the array of index i. means the lenght of the elements of row.. you can imagine it as theres a array inside another..
    - now we check if the element[row][col] == target or not if it is equal then it will return an array of both the indices and store it in a array called indices.
    - now to print the array we can either use another for loop that again iterates over this array, or we can use the Arrays.toString() from the Arrays class.

    ----Time Complexity----
    O(N^2)
    */
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5},{6,7}};
        int target = 6;
        int indices[] = Search(arr, target);
        System.out.println(Arrays.toString(indices));
    }
    static int[] Search(int[][] arr , int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
}
