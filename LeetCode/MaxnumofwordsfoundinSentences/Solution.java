public class Solution {
    public static void main(String[] args) {
        String[] sentences = {"t qnnbpqul iuzejkwniruscnvkdwgmvdajbgmbytioldkixld","uqcnehvw nn idofvpqwrmsnygsgyijxearenslmbbsxxqykhnwbavkhszazrvuywtubispckkymswtdgpfloqjdtx"};
        System.out.println(maxnumofwords(sentences));
    }

    public static int maxnumofwords(String[] sentences) {
        int count[] = new int[sentences.length];
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            count[i] = sentences[i].split("\\s").length;
        }

        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        return max;
    }
}
