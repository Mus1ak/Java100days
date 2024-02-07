import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5};
        System.out.println(findMissing(array, array.length));
    }

    public static int findMissing(int[] array, int n) {
        Arrays.sort(array);
        int missing = 0;

        if (array.length == 1) {
            missing = array[0] == 1 ? 2 : 1;
        } else {
            if (array[0] != 1) {
                missing = 1;
            } else if (array[array.length - 1] != n) {
                missing = n;
            } else {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i + 1] - array[i] > 1) {
                        missing = array[i] + 1;
                        break;
                    }
                }
            }
        }
        return missing;
    }
}
