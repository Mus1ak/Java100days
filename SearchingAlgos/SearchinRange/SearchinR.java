public class SearchinR {
    public static void main(String[] args) {
        // search in a range
        int[] arr = { 1, 2, 31, 4, 52, 425 };
        int key = 52;
        int start = 2;
        int end = 5;
        System.out.println(inRange(arr, key, start, end));
    }

    public static int inRange(int[] arr, int key, int s, int e) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = s; i < e; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
