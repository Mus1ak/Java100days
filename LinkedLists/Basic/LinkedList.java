
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //medthods - add, remove etc
//--------------------------------------------------------------------------
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);

        //base case: if the the ll is empty then create a node and mark it as head and tail
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //point new node's next to the head
        newNode.next = head; //Linking of nodes

        //change head to this node
        head = newNode;
    }

    //--------------------------------------------------------------------------

    public void addLast(int data){
        //create node
        Node newNode2 = new Node(data);
        //base case - if linkedlist is empty
        if(head == null){
            head = tail = newNode2;
            return;
        }

        //point previous node's tail to the newnode
        tail.next = newNode2;

        //change tail
        tail = newNode2;
    }


    public void addinMiddle(int idx, int data){

        if (idx == 0) {
            addFirst(data);
        }

        Node newNode3 = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //when i == idx - 1
        newNode3.next = temp.next;
        temp.next = newNode3;
    }

//--------------------------------------------------------------------------
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


    public int removeFirst(){

        if (size == 1) {
            head = tail = null;
            return Integer.MIN_VALUE;
        }

        int value = head.data;
        head = head.next;

        return value;
    }


    public int itrSearch(int key){
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }   

    //function to reverse a linked list (iterative method - using loop)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthNodefromEnd(int N){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        //if the nth node is basically the first node then just remove the head or we can say remove first operation will be performed
        if(N == sz){
            head = head.next;
            return; 
        }

        //remove nth node from end is basically remove -> (size - n + 1)th node from start so we will go till the prev node of that nth node and then just change its next to the next of next
        Node prev = head;
        int i = 1;
        while (i < sz - N) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }


    //slow fast apporoach - turtle rabbit approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is the mid

    }

    public boolean checkPalindrome(){
        //edge case if ll is empty or ll has only one node -> so its def a palindrome
        if(head == null || head.next == null) return true;
        //1. find mid
        Node midNode = findMid(head);
        //2. reverse the 2nd half 
        Node curr = midNode;
        Node prev = null;
        
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //3. check if the right is equal to left
        while (right != null) {
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
//------------------------Main Driver code------------------------------
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //Add first
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(1);

        
        //Add last
        // ll.addLast(3);
        // ll.addLast(1);
        //add in the middle
        // ll.addinMiddle(2, 7);
        //Print
        // ll.reverse();
        // ll.printLL();
        
        // ll.removeNthNodefromEnd(5);
        ll.printLL();
        System.out.println(ll.checkPalindrome());

    //    System.out.println( ll.itrSearch(9));
    }
}
