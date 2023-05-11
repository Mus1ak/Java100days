import java.util.Scanner;

public class Count_occ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        int key = 7;
        int j = 0;
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                newarr[j] = arr[i];
                j++;
            }
        }
        System.out.println(j);
    }
}