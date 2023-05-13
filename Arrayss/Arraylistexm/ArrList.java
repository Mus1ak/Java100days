import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        /*
         * - Arraylist is a class in java's standard library that provides a dynamic
         * array like datastructure.
         * - it can be dynamically resized, we dont have to know about the size of the
         * array we want to create like we have to do it in arrays.
         * - it is implemented same as a regular array that is resized and copied to a
         * new array when its capacity is reached it all happens dynamically.
         * - it provides methods like add, remove, set, get.
         * - it usefull when we dont know what could be the size of the array.
         */
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(5);
        // taking input
        for (int i = 0; i < 5; i++) {
            arr.add(in.nextInt());
        }
        // output
        for (int i = 0; i < 5; i++) {
            System.out.print(arr.get(i));
        }
        
    }
}
