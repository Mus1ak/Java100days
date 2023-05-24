class Solutionn {
  /*
  Happy Number -> We have a number, and our task is to split it into its digits. We then square each digit and split the resulting square into its digits again. We continue this process, squaring and splitting, until we reach a total sum of 1. Along the way, we add the resulting values to a variable called "total sum."

  Algorithm :
  - Start with an input integer n.
  - Initialize a variable totalS to 0.
  - While n is greater than 0, repeat steps 4-6.
  - Calculate the remainder (rem) when n is divided by 10.
  - Update n by dividing it by 10.
  - Add the square of rem to totalS.
  - If totalS is equal to 1, return true.
  - If totalS is equal to 4, return false.
  - Recursively call the calcSq function with totalS as the new input and return the result to isHappy function.
  - it will check if it is equal to 1.
  - it will return true if it is otherwise false.

  ------------------------------------------------------------------------------------
  Code:
  */

  public static void main(String args[]) {
    // int n = 19;
    int n = 2;
    System.out.print(isHappy(n));
  }

  public static boolean isHappy(int n) {
    if (n == 1) {
      return true;
    }
    return calcSq(n);
  }

  static boolean calcSq(int n) {
    int totalS = 0;
    while (n > 0) {
      int rem = n % 10;
      n = n / 10;
      totalS += rem * rem;
    }
    if (totalS == 1) {
      return true;
    }
    if (totalS == 4) {
      return false;
    }
    return calcSq(totalS);
  }
}
