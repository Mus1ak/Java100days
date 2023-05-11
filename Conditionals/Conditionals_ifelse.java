

public class Conditionals_ifelse {
    public static void main(String[] args) {
        // if else are the conditionals and most important base of programing languages.. it checkes whether a certain condition that is given is True or false. if it is true it runs executes the True block otherwise it exectues the else block. 

        /*Syntax of If else
        if(Condition){
            body
        }
        else{
            body
        } 
        */

        int biscut = 1000;
        if(biscut>=900){
            biscut+=100;
        }else{
            biscut-=90;
        }
        System.out.println(biscut);
    }
}
