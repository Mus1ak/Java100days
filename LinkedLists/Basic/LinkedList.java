
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

//------------------------Main Driver code------------------------------
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //Add first
        ll.addFirst(2);
        ll.addFirst(1);
        //Add last
        ll.addLast(3);
        ll.addLast(4);
        //add in the middle
        ll.addinMiddle(2, 7);
        //Print
        ll.printLL();

       System.out.println( ll.itrSearch(9));
    }
}
