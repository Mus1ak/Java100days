import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazg";
        System.out.println(CheckIfpanagram(sentence));
    }  
    
    //using regex
    public static boolean CheckIfpanagram(String sentence){
        long c = sentence.toLowerCase().chars()
      .filter(ch -> ch >= 'a' && ch <= 'z')
      .distinct()
      .count();
    return c == 26;
    } 
}
