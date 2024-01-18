
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

    //medthods - add, remove etc
//--------------------------------------------------------------------------
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);

        //base case: if the the ll is empty then create a node and mark it as head and tail
        if (head == null) {
            head = newNode = tail;
            return;
        }
        //point new node's next to the head
        newNode.next = head; //Lining of nodes

        //change head to this node
        head = newNode;
    }

    //--------------------------------------------------------------------------

    public void addLast(int data){
        //create node
        Node newNode2 = new Node(data);
        //base case - if linkedlist is empty
        if(head == null){
            head = newNode2 = tail;
            return;
        }

        //point previous node's tail to the newnode
        tail.next = newNode2;

        //change tail
        tail = newNode2;
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

//------------------------Main Driver code------------------------------
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //Add first
        ll.addFirst(2);
        ll.addFirst(1);
        //Add last
        ll.addLast(3);
        ll.addLast(4);
        //Print
        ll.printLL();
    }
}
