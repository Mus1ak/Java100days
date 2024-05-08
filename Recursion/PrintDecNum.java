public class PrintDecNum {

    public static void printDec(int n){
        //base case
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int num = 10;
        printDec(num);
    }
}
