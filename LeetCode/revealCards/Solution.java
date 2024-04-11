import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int deck[] = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        //reveal top card - remove queue
        //if theres more card below it then move that card to the bottom of the deck
        Arrays.sort(deck);
        int revealed[] = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<deck.length; i++){
            q.add(i);
        }
        for (int card : deck) {
            revealed[q.poll()] = card; 
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return revealed;
    }
}
