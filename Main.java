/* Online Java Compiler and Editor */
import java.util.Scanner;
public class Main {

    public static void main(String []args) {
        Primes(1, 100000);
    }

    public static void Primes(int a, int b) {
        for (int i = a+1; i < b; i++) {
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        boolean res = false;
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                if(i!=n/i){
                    count+=2;
                }
                else{
                    count++;
                }
            }
        }
        if(count == 2){
            res = true;
        }
        return res;
    }
}