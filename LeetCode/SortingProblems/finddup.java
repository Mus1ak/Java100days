public class finddup {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 3, 2 };
        System.out.println(sort(arr));

    }

    static int sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {

            if (i + 1 != arr[i]) {
                if (arr[i] != arr[arr[i] - 1]) {
                    swap(arr, i, arr[i] - 1);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
