import java.util.Arrays;

public class An {
    public static void main(String[] args) {
        String s = "rac";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }   
    
    public static boolean isAnagram(String s, String t){
        if(s.length() == t.length()){
            int charCount[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                charCount[s.charAt(i) - 'a']++;
                charCount[t.charAt(i) - 'a']--;
            }
            for (int count : charCount) {
                if(count != 0) return false;
            }
                return true;
            
        }

        return false;
    }
}
