public class DescBinSearch {
    public static void main(String[] args) {
        int[] arr = {33,27,5,3,2,1};
        int key = 27;

        System.out.println(Search(arr, key));
    }
    static int Search(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while (start<=end) {
            int mid = (start + end) /2;
            if(arr[mid] == key ){return mid;}
            else if(arr[mid]<key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
