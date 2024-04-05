

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static void main(String[] args) {
        
    }    
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public boolean isPalindrome(ListNode head) {
        // if(head == null || head.next = null) return true;
        //find th middle node 
        ListNode midNode = findMid(head);
        ListNode curr = midNode;
        ListNode prev = null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
    }
}


