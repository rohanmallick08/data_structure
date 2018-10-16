class TraverseLinkedList {

    static class Node {

        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Define head
    Node head;

    public static void main(String[] args) {
       TraverseLinkedList tll = new TraverseLinkedList();
       
       tll.head = new Node(1);
       tll.head.next = new Node(2);
       tll.head.next.next = new Node(3);
       tll.printList();
    }

    public void printList() {
        Node h = head;

        while(h != null) {
            System.out.println(h.data + " ");
            h = h.next;
        }
    }
}