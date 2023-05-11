//program to swap numbers - take two numbers from the user and swap it.

import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swapped values of a & b:"+a+" "+b);
    }
}
