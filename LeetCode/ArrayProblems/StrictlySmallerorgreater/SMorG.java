public class SMorG {
    public static void main(String[] args) {
        int[] arr = {-1,5,121,661,2};
        System.out.println(max(arr));
    }
    //here i tried to first come up with the max and the min element and then i am checking with every element if the current element doesnt matches the max or the min element then increment the count since the question says strictly increasing or strictly decreasing number .
    public static int max(int[] arr){
        int maxEl = arr[0];
        int minEl = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxEl < arr[i]) {
                maxEl = arr[i];
            }
            if (minEl > arr[i]) {
                minEl = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxEl != arr[i] && minEl != arr[i]) {
                count++;
            }
        }
        return count;
    }
}
