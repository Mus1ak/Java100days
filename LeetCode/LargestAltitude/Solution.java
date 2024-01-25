public class Solution {
    public static void main(String[] args) {
        int gain[] = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(larAlt(gain));
    }

    public static int larAlt(int[] gain) {
        int currentAltitude = 0;
        int largestAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            System.out.println(currentAltitude);
            if (currentAltitude > largestAltitude) {
                largestAltitude = currentAltitude;
            }
        }

        return largestAltitude;
    }
}
