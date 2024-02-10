import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        convertToWave(5, a);
        System.out.println(Arrays.toString(a));
    }  
    public static void convertToWave(int n, int[] a) {
        int index = 1;
        int i = 0;
        while(index < n){
            int temp = a[i];
            a[i] = a[index];
            a[index]= temp;
            i=index + 1;
            index += 2;
        }
    }
}
