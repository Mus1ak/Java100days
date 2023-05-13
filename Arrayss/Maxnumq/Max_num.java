public class Max_num {
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,2};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int maxnum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }
}
