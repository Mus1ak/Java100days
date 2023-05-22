public class RevInt {
    public static void main(String[] args) {
        int n1= 123;
        int n2 = -120;
        int n3 = 1534236469;

        System.out.println(rev(n1));
        System.out.println(rev(n2));
        System.out.println(rev(n3));

    }

    static int rev(int n) {
        long reverseInt = 0;
        while(n!=0){
            int rem = n%10;
            reverseInt = reverseInt * 10 + rem;
            n = n / 10;
        }
        //edge cases
        /*
        - it says it should lie in the range of Integer.MAX_VALUE = 2^31-1 = 2147483647 & Integet.MIN_VALUE = -2^31
        - for that we can use the Integer.MAX_VALUE, Integer.MIN_VALUE methods of java that are inbuilt.

        - Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies that stores the maximum possible value for any integer variable in Java.

        Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java.
        */

        if(reverseInt > Integer.MAX_VALUE  || reverseInt < Integer.MIN_VALUE){
            return 0;
        }
        if(n < 0){
            reverseInt = -reverseInt;
        }
        return (int)reverseInt;
    }
}
