import java.util.ArrayList;

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        
    }

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        for (int num : list) {
            sb.append(num);
        }

        return Integer.parseInt(sb.toString() , 2);
    }
}
