//brute force method - Time complexity - O(n)


// public class CountFactors {
//     public static void main(String[] args) {
//         Facs(24);
//         // System.out.println(result);
//     }

//     public static void Facs(int n){
//         // int count = 0;
//         /* N = 24 -->> 1,24,2,12,3,8,4,6 --> 8 factors */
//         for (int i = 1; i <= n; i++) {
//             if (n%i == 0) {
//                 System.out.println(i);
//             }
//         }
//         // return count;
//     }
// }
    

// OPTIMIZED Method
public class CountFactors {
    public static void main(String[] args) {
        Facs(24);
    }

    public static void Facs(int n){
        /* N = 24 -->> 1,24,2,12,3,8,4,6 --> 8 factors */
        for (int i = 1; i*i <= n; i++) {
            if (n%i == 0) {
                System.out.println(i + "\n" + n/i);
            }
        }
    }
}