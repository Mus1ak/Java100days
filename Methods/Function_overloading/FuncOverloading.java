
public class FuncOverloading {
    public static void main(String[] args) {
        //what is function overloading : when two functions have the same name/same return type but the arguments are different.
        num();
        num(2);
    }
    static void num(){
        System.out.println("i am in num1 func");
    }
    static void num(int a){
        System.out.println("i am in func2 and the value of a is :"+a);
    }
}
