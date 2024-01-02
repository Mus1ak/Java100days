// -----------------------------------------BruteForce------------------------------------------

//A positive integer is called a palindrome if its representation in the decimal system is the same when read from left to right and from right to left. For a given positive integer K of not more than 1000000 digits, write the value of the smallest palindrome larger than K to output. Numbers are always displayed without leading zeros.

public class TheNextPalindrome {
    public static void main(String[] args) {
        for (int i = 2223; i < 10000; i++) {
            if (isPalindrome(i) != -1) {
                System.out.println(i);
                break;
            }
        }
    }

    //To check if the number is palindrome or not if it is then it will simply rerturn the number otherwise it will return -1;
    public static int isPalindrome(int n){
        int tempNum = n;
        int revNum = 0;
        while(tempNum > 0){
            int lastdigit = tempNum%10;
            revNum = revNum * 10 + lastdigit;
            tempNum /= 10;
        }
        if (revNum == n) {
           return revNum;
        }
        return -1;
    }
}
// -----------------------------------------OPtimized------------------------------------------
