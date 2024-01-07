public class AtleastTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,5,2,3,5};
        System.out.println(atleastOnce(arr));
    }
    public static int atleastOnce(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
}
