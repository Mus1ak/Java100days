public class Solution {

    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static void main(String[] args) {
        
    }

    public static int findgcf(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        //size size size
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode newNode = new ListNode(findgcf(curr.val, curr.next.val));
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next; 
        } 
    return head;
    }
}
