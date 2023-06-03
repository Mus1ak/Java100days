
public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {4,0,1,2};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctInd = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctInd]){
                swap(arr, i, correctInd);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j ){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
