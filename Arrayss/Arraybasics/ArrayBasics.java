import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        // arrays are basically a datastructure that allows you to store a collection of elements of the same type in a contiguous block of memory.
        // each element has its own index starting from 0 to the length or array - 1 for the last element.

        //to make an array : datatype name[] = new datatype[size]
        // - here the dataype means int, string etc
        // - new keyword is used to make an object jvm allocates a memory to it and sets all of its properties to default.
        // - name is the reference variable 
        
        // 1. int arr[] = new int[5];
        // 2. int arr2[] = {1,2,3,4,5};
        // 3. int arr3[];
        // arr3[0] = 1;
        // arr3[1] = 2;
        // arr3[3] = 4;

        //to access the individual element of an array we can use the indexes like i did above in (3).

        //similarly we can make string array also
        Scanner in = new Scanner(System.in);
        String names[] = new String[5];
        //taking input from the user in an array we use for loop
        for (int i = 0; i < names.length; i++) {
            names[i] = in.nextLine();
        }
        //output
        System.out.println(Arrays.toString(names));
    }
}
