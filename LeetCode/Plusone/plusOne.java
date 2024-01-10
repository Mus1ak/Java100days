import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        System.out.println(Arrays.toString(pOne(digits)));
    }
    public static int[] pOne(int[] digits) {
        long normalNum = 0;
        for (int i = 0; i < digits.length; i++) {
            normalNum = digits[i] + (10 * normalNum);
        }
        normalNum += 1;
        long temp = normalNum;
        int numDigits = 0;
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }
        int[] result = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            result[i] = (int) (normalNum % 10);
            normalNum /= 10;
        }
        return result;
    }
}
