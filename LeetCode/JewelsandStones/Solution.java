public class Solution {
    public static void main(String[] args) {
        String jewels = "aAAbbbb";
        String stones = "a";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;
        char[] jew = jewels.toCharArray();
        char[] st = stones.toCharArray();

        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < jew.length; j++) {
                if (st[i] == jew[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
