public class Orderagnostic {
    public static void main(String[] args) {
        //you will be given a sorted array but you dont know if its ascending or descending

        int[] arr = {33,32,27,21,2,1};
        int key = 27;

       System.out.println(orderAgnsticSearch(arr, key));
    }

    static int orderAgnsticSearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isDsc = arr[start]>arr[end];
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == key){return mid;}
            if(isDsc){
                if(arr[mid]<key){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid]>key){
                    start = mid + 1;
        
                }else{
                    end = mid - 1; 
                }
            }
        }
        return -1;
    }

    
}
