public class SmallestLetter {
    public static void main(String[] args) {
        // we are given with an array of letters in ascending order, and a target
        // element, we have to return the smallest character in the array that is larger
        // than the target element.

        char arr[] = { 'c', 'd', 'f' };
        char target = 'c';
        System.out.println(Search(arr, target));

    }
    public static char Search(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int mid = s + ((e - s) / 2);
            if (letters[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        // wrap around : if start reaches the length of the end then we do s%lenght of
        // the array ..it will give us 0 we will on the first index , thats what wrap
        // around is.
        return letters[s % letters.length];
    }
}
