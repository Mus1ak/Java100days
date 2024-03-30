class Solution{

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static void main(String[] args) {
        Solution ll = new Solution();
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int i = 1;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return head;
        }

        temp = head;
        while(i < size - n){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
    
}