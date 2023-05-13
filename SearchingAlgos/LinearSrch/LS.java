public class LS {
    public static void main(String[] args) {
        //Searching - means searching for an element basically

        //Linear Search - its a searching algorithm that checks for a target or key element is present within an list or array by sequentially checking each element until it finds the key or target value or untill all elements have been searched.

        // int[] arr = {1,24,14,451,69};
        // int key = 69;
        // System.out.println(LinSearch(arr, key));

        String[] names = {"Leo","Mai","Dasha","Harry"};
        String target = "Dasha";
        System.out.println(LinSearch(names, target));
    }
    // public static int LinSearch(int[] arr, int key){
    //     for (int i = 0; i < arr.length; i++) {
    //         if(key == arr[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int LinSearch(String[] arr, String key){
            for (int i = 0; i < arr.length; i++) {
                if(key == arr[i]){
                    return i;
                }
            }
            return -1;
        }

}
