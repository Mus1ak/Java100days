// generate a series of numbers till K using only 1s & 2s


//idea -                1 2
            //     11-12         21-22
            // 111-112     121-122     211-212     221-222

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(KthSeq(5));
    }

    public static String KthSeq(int k){
        String res = "";
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        for (int i = 1; i <= k; i++) {
            String temp = q.remove();
            res = temp;
            q.add(res+"1");
            q.add(res+"2");
        }
        return res;

    }
}
