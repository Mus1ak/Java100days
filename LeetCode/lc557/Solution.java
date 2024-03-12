class Solution{
    public static void main(String[] args) {
        String s = "R'amadan Kareem";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String words[] = s.split(" ");
        for (int i=0; i<words.length; i++) {
            char[] charArray = words[i].toCharArray();
            int start = 0;
            int end = charArray.length - 1;
            while (start <= end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
            words[i] = new String(charArray);
        }
        String res = String.join(" ",words);
        return res;

    }
}