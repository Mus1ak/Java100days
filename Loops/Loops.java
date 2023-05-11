
public class Loops {
    public static void main(String[] args) {
        // loops we have 3 types of loops
        /*
         * 1. for loop : use for loop when you know how many times you have to run the
         * code.
         * Syntax :
         * for(initialisation; condition; increment/decrement){
         * body
         * }
         * 
         * 2. while loop - use while loop when you dont know how many times it will run.
         * like take input from user until it presses "V"
         * 
         * Syntax :
         * while(condition){
         * body
         * }
         * 
         * 3. do while loop - do while loop is different from while loop in terms that
         * it runs or executes at least ones before checking the condition even if the
         * condition is false it will still run the code within the block at least once.
         * Syntax :
         * do{
         * body
         * }while(condition)
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        int k = 0;
        do {
            System.out.println("hey i am in do while loop and the condition is false.");
        } while (k != 0);
    }
}
