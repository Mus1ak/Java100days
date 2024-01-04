
import java.util.Arrays;

public class RevString {
    public static void main(String[] args) {
        char[] s = {'c','h','o','u'};
        ReverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void ReverseString(char[]s ){
        int startIndex = 0;
        int endIndex = s.length - 1;
        while (startIndex < endIndex) {
            char tempChar = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = tempChar;
            startIndex++;
            endIndex--;
        }
    }
}
