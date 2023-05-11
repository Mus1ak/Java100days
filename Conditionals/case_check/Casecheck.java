import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);
        if(c >= 'A' && c <= 'Z' ){
            System.out.println("Uppercase");

        }else if(c >= 'a' && c <= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("Special character");
        }
    }
}
