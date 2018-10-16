class LinkedList {

    //Create the Node class
    static class Node{
        int data;
        Node next;
        //Node constructure
        Node(int data) {
            this.data = data;
            this.next = null;
        };
    }

    //Let's define the head on LinkedList
    Node head;

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        //Let's create the three node
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //now all the node are in random memory, link them for LinkedList
        list.head = n1;
        list.head.next = n2;
        n2.next = n3;

        //Just Print Out the Data
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);

    }
}