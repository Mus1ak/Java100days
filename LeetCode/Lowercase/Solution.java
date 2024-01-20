public class Solution {
    public static void main(String[] args) {
        String s = "Hello worLSAd";
        System.out.println(toLowerC(s));
    }

    public static char[] toLowerC(String s){
        char[] c = new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'A' && c[i] <= 'Z'){
                c[i] += 32;
            }
        }


        return c;
    }
}
