import java.util.Arrays;

public class CyclicSort {
    //cyclic sort 
    /*
    - if given range 0-N or 1-N or any continuos then just apply cyclic sort.
    - We have an array: 3, 5, 1, 2, 4.
    - We want to check if each element is in its correct position.
    - To find the correct position, we subtract 1 from each element.
    - The correct positions would be 2, 4, 0, 1, and 3 in this case.
    - We iterate through the array and compare each element with its correct position.
    - If an element is not in its correct position, we swap it with the element currently occupying that position.
    - We repeat this process until all elements are in their correct positions.
    - The time complexity of this process is O(N), where N is the number of elements in the array.
    - This means that the worst-case scenario would require N operations to sort the array.
    */
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        CylSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*static void CylSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i] - 1){
                swap(arr, i, (arr[i] -1));
            }
        }
    }
    */
    //Correct method
    static void CylSort(int[] arr) {
        int index = 0;
        while(index < arr.length){
            int correctInd = arr[index] - 1;
            if(arr[index] != arr[correctInd]){
                swap(arr, index, correctInd);
            }
            else{
                index++;
            }
        }
    }
    static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
