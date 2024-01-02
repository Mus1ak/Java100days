public class Squareroot {
    public static void main(String[] args) {
        System.out.println(sqrtofn(60));
    }
    public static int sqrtofn(int n){
        int res =0;
        for (int i = 1; i*i <= n ; i++) {
            res = i;
        }
        return res;
    }

}

