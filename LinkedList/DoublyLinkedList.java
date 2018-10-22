class DoublyLinkedList {

    static class Node {
        //It will both next and prev pointer;
        int data;
        Node next;
        Node prev;

        Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //define head pointer;
    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void addAt(int data, int index) {
        if (index == 0) {
            Node node = new Node(data);
            node.next = head;
            node.prev = null;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            return;
        }

        int count = 0 ;
        Node current = head;
        Node previous = null;
        boolean indexFound = false;
        while(current != null) {
            if (count == index) {
                Node node = new Node(data);
                node.next = previous.next;
                node.prev = previous;
                previous.next = node;
                current.prev = node;
                indexFound = true;
                return;
            }
            count++;
            current = current.next;
            previous = current != null ? current.prev : null;
        }
        if (!indexFound) {
            System.out.println("No Index Found");
        }
    }

    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        //traverse till last node
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    public void print() {
        Node current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        } 
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addAt(9, 0);
        list.push(3);
        list.push(2);
        list.push(8);
        list.addAt(4, 1);
        list.addAt(7, 4);
        //list.addAt(7, 6);
        list.append(12);
        list.print();
    }
}