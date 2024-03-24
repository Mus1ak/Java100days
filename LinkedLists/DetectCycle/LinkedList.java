
public class LinkedList {
    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void printLL(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean DetectCycle(){

        //Floyd's Cycle Finding Algorithm - as at a certain point both slow and fast pointers will meet except at the start as the both start from head. so if they meet at some other point rather than just at the start it means a cycle exists -- which can lead to infinite iterations.

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true; //cycle exits
        }
        return false; //cycle doesn't exist
    }

    //remove cycle
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean Cycle = false;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Cycle = true;
                break;
            }
        }
        //change slow to head
        slow = head;
        //remove cycle
        Node prev = null;
        while (fast!=slow) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }
    


    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(4);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        
        System.out.println(DetectCycle());
        removeCycle();
        System.out.println(DetectCycle());
    }

}
