
public class Solution {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }   
    public static int differenceOfSums(int n, int m) {
        int sumN = 0;
        int sumM = 0;
        for(int i=1; i<=n;  i++){
            sumN = (i%m == 0)? sumN + i : sumN;
            sumM = (i%m != 0)? sumM + i : sumM;
        }
        
        return (sumM - sumN);
    } 
}
