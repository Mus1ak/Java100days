import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'||c == 'A' || c == 'E'|| c == 'I'|| c == 'O'|| c == 'U'){
                vowels.append(c);
            }
        }

        char[] sortedVowels = vowels.toString().toCharArray();
        Arrays.sort(sortedVowels);

        StringBuilder res = new StringBuilder(s);
        int vowIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'||c == 'A' || c == 'E'|| c == 'I'|| c == 'O'|| c == 'U'){
                res.setCharAt(i, sortedVowels[vowIndex]);
                vowIndex++;
            }
        }

        return res.toString();
    }
}
