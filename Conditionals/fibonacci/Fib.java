import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = in.nextInt();
        System.out.print(0+" "+1+" ");
        for (int i = 2; i <= n; i++) {
            if(n==0){
                System.out.println(a);
            }else if(n==1){
                System.out.println(b);
            }else{
                
                int temp = a +b;
                a = b;
                b = temp;
                System.out.print(b+" ");
            }
        }
    }
}
