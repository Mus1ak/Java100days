import java.util.Scanner;

public class Mt_func {
    public static void main(String[] args) {
        //methods or functions : it is a block of code that performs a specific task or maybe that task that can be used repeatedly again and again. 

        /*
        Syntax:
        return_type name(){
            body
        }
        return_types can be int, float, String etc etc
        name - is the name you want to give to the function
        body - is the thing that you want the function to do.

        inside the () we add arguments or parameters when needed these arguments can be used by the function within the function only as they are locally scoped.
    
        */


        //primitves are pass by value and it changes the object but it wont change the original object. as java doesnt have any concept of pointers we dont have the addresss of the variable or the reference of the variabl.....however some datatypes like array can be changed if we do arr[0] = {99} it will change the value in the original object as it is passed by refernce of the value of that variable... quite complex though
        
        //scope means you can only access the variables that are inside a certain function. 

        //BMI of a person using function
        Scanner in = new Scanner(System.in);
        float w = in.nextFloat();
        float h = in.nextFloat();
        System.out.println("BMI is : "+BMI(w, h));
    }
    public static float BMI(float w, float h){
        float bmi = w/(h*h);
        return bmi;
    }
}
