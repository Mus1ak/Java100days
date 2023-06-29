public class printNums {

    static void nums(int n) {
        if (n == 0) {
            return;
        }
        nums(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 6;
        nums(n);
    }
}
