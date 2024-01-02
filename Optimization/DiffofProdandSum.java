public class DiffofProdandSum {
    public static void main(String[] args) {
        System.out.println(diff(12345));
    }
    public static int diff(int n){
        int sum = 0;
        int product = 1;
        //count the number of digits first
        while (n>0) {
            int lastdigit = n%10;
            sum = sum + lastdigit;
            product = product * lastdigit;
            n/=10;
        }
        return (product - sum);
    }
   
}
