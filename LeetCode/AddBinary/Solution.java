import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        // return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}
