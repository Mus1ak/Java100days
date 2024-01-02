public class SumofNnatural {
    public static void main(String[] args) {
        System.out.println(SumN(5));
    }
    //optimized ----
    public static int SumN(int n){
        return (n*(n+1))/2;
    }

    //BruteForece
    // public static int SumN(int n){
    //     int result = 0;
    //     for (int i = 1; i <= n; i++) {
    //         result+=i;
    //     }
    //     return result;
    // }
}
