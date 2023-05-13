
public class Pattern3 {
    public static void main(String[] args) {
        // Input: N = 3
        // Output Pattern:
        // 1
        // 1 2
        // 1 2 3
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
