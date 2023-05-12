
public class isPrimenum {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while(i*i<=num){
            if(num%i==0){return false;}
            i++;
        }
        return i*i>num;
    }
}
