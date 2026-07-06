class LinkedList {
    Node head;
    private int size;
    LinkedList(){
    this.size=0;
    }
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
        size++; 
    }
} //Major 4 operations in linked list- add,delete,print,size
    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
       newNode.next = head;
        head = newNode;
    }
    //add-last
     public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
       //print 
       public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //delete first
    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head == null) {  
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode=head.next; //head.next=null->lastnode=null
        while(secondLast.next.next != null) {//null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }  
//size
    public int getSize() {
        return size;
    }
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is"); 
        list.printList();
        list.addLast("linkedlist");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println("Size of the list: " +  list.getSize());
    }
}
