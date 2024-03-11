import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "missimpi";
        System.out.println(finalString(s));
    }

    public static String finalString(String s) {
        char[] letters = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'i') {
                int start = 0;
                int end = i - 1;
                while (start < end) {
                    char temp = letters[start];
                    letters[start] = letters[end];
                    letters[end] = temp;
                    start++;
                    end--;
                }
            }
        }
    
        for(int i=0; i<letters.length; i++){
            if(letters[i] == 'i'){
                continue;
            }else{
                list.add(letters[i]);
            }
        }    
        //converting the list to string using string builder
        StringBuilder result = new StringBuilder(list.size());
        for (Character c : list) {
            result.append(c);
        }

        return result.toString();
    }
}
