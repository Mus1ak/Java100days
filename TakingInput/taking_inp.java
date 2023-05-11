import java.util.Scanner;

public class taking_inp {
    //to take a input from the user or the keyword we will simply use the "Scanner" class that is inbuilt by java people in java before that we have to import it to our code editor "import java.util.Scanner;" like this and then we will create an object of this class using the "new keyword" and assign it to a identifier here in our case its "inp".

    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        
        
        // we used ".nextInt() - it basically takes the next integer input. like this we have many other methods :-"
        /* 1. nextInt() - for integer
         * 2. nextLine() - for String , it takes the whole line of the String that you entered. for example - if you entered : Hello I am Mustak, the output will be : Hello I am Mustak.
         * 3. next() - for String also , but it takes the first word or ends at the space of the inputed string. for example , Input : Hello I am Mustak, Output : Hello
         */

         System.out.println("The number that you entered is : "+num);
    }
}
