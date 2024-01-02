///BRUTEFORCE method

// public class PrimeNum {
//     public static void main(String[] args) {
//         System.out.println(isPrime(2));
//     }
//     public static boolean isPrime(int n){
//         boolean result = true;
//         for (int i = 1; i*i <= n; i++) {
//             if (n%i!=0) {
//                 result = false;
//             }
//         }
//         return result;
//     }
// }


public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
    public static boolean isPrime(int n ){
        boolean result = false;
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                if(i != n/i){
                    count+=2;
                }else{
                    count++;
                }
            }   
        }
        if (count == 2) {
            result = true;
        }
        return result;
    }
}