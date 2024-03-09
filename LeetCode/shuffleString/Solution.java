class Solution{
    public static void main(String[] args) {
        String s = "ahsaD";
        int[] indices = {4,3,2,1,0};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {

        char[] temp = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);

    }
}