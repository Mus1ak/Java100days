import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        // switch case is nothing too complicated and it is similar to if else thought
        // it is not exactly similar but works the same as if else will do.
        /*
         * Syntax :
         * switch(expression){
         * case 1:
         * body
         * break;
         * case 2:
         * body
         * break;
         * default:
         * body
         * }
         * 
         * break is necessary to add if you dont want the lines to execute that are
         * below that choice you want to execute or run.
         */
        Scanner in = new Scanner(System.in);
        String car = in.nextLine();
        switch (car) {
            case "mercedes":
                System.out.println("Mercedes is a German luxury automotive brand known for its high-quality engineering, innovative technology, and prestigious reputation.");
                break;
            case "audi" :
                System.out.println("Audi is a German luxury automotive brand known for its sleek and modern design, advanced technology, and commitment to innovation.");
                break;
            default:
            System.out.println("Enter a valid luxury car name !");
                break;
        }
    }
}
