import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String words[] = {"abc","bcd","aaaa","cbc"};
        // System.out.println(Arrays.toString(list.toArray(findWordsContaining(words , 'e'))));
        System.out.println(findWordsContaining(words, 'a'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> myList = new LinkedList<>(); 
        for (int i = 0; i<words.length; i++) {
            if(words[i].indexOf(x) != -1){
                myList.add(i);
                
            }
        }
        return myList;
    }
}
