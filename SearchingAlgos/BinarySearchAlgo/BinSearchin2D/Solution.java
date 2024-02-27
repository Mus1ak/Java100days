
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 32));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row*col-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int tempCol = mid % col;
            int tempRow = mid / col;

            int val = matrix[tempRow][tempCol];
            if(val == target){
                return true;
            }
            if(val<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
