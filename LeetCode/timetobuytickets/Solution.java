import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int tickets[] = {2,3,2};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            q.add(i); 
        }

        while (!q.isEmpty()) {
            int ind = q.poll();
            tickets[ind]--;
            time++;
            if(tickets[ind] == 0 && ind == k){
                return time;
            }
            if (tickets[ind] > 0) {
                q.add(ind);
            }
        }
        return time;
    }
}
