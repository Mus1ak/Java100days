/*
    Shadowing in java refers to a situation where a declared variable withtin a certain scope has another variable with the same name as a variable declared in the outerscope.
    the innerscope variable overshadows the outerscope variable.
*/

public class Shadowing_ex {

    //outerscope variable
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x); //100 outerscope variable
        int x = 99; //99 as the outerscope varible is effectively hidden by the innerscope variable
        System.out.println(x);
    }
}
