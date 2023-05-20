public class sortedtwo {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 6;

        System.out.println(Search(Convert(arr), target));
    }

    static int[] Convert(int[][] arr) {
        int conArr[] = new int[arr.length * arr[0].length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                conArr[counter] = arr[i][j];
                counter++;
            }
        }
        return conArr;
    }
    static int Search(int[] arr, int target){
        int s = 0; int e = arr.length - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){return mid;}
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
