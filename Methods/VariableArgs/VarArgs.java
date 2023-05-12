import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //varargs are nothing but variable length arguments that means the lenght of the cariable is not fixed it varying.....

        // to use it just add "datatype/int/String...(name) it basically  takes it as a array of int/string"
        
        num(1,2,3,4,5,2,31,31,314,14,42);
    }
    public static void num(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
