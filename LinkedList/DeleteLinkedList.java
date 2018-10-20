class DeleteLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //Delete LinkedList
    public void deleteList() {
        //Just make head as null in JAVA as it has garbage collector
        //In C/C++, manully free all node and make head as null.
        head = null;
    }

    public static void main(String[] args) {
        DeleteLinkedList list = new DeleteLinkedList();
        list.push(3);
        list.push(4);
        list.push(5);
        list.print();
        list.deleteList();
        list.push(6);
        list.print();

    }
}