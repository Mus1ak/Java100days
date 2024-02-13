import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanInt("IVXL"));
    }   
    public static int romanInt(String s){
        HashMap<String, Integer> romanIntmap = new HashMap<String, Integer>();
        romanIntmap.put("I", 1);
        romanIntmap.put("V", 5);
        romanIntmap.put("X", 10);
        romanIntmap.put("L", 50);
        romanIntmap.put("C", 100);
        romanIntmap.put("D", 500);
        romanIntmap.put("M", 1000);

        int intNum = romanIntmap.get(String.valueOf(s.charAt(s.length() - 1)));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanIntmap.get(String.valueOf(s.charAt(i))) < romanIntmap.get(String.valueOf(s.charAt(i + 1)))) {
                intNum-=romanIntmap.get(String.valueOf(s.charAt(i)));
            }else{
                intNum+=romanIntmap.get(String.valueOf(s.charAt(i)));
            }
        }
        return intNum;

    } 
}
