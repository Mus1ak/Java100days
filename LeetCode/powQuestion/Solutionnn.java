// pow(x,n) question
/*
Algorithm:
1. Start the function myPow with parameters x (base) and n (exponent).
2. Check if n is equal to 0:
    If true, return 1.0 (since any number raised to the power of 0 is 1).
3. Check if n is negative:
    If true, update x to be the reciprocal of x (1.0 / x).
    Update n to be the absolute value of n (-n) to ensure we work with a positive exponent.
4. Call the helper function powHelper with parameters x and n and return the result.
5. Define the helper function powHelper with parameters x and n.
6. Check if n is equal to 0:
    If true, return 1.0 (since any number raised to the power of 0 is 1).
7. Calculate half as the result of calling powHelper recursively with parameters x and n divided by 2.
8. Check if n is even (n % 2 == 0):
    If true, return the square of half (half * half).
    If false, return the product of half, half, and x (half * half * x).
*/

public class Solutionnn {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1.0 / x;
            n = -n;
        }

        return powHelper(x, n);
    }

    private static double powHelper(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = powHelper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

}
