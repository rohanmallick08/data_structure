class LinkedListInsertion {

    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }  
    }

    //Define head node
    Node head;

    //Insert Node at the beginning
    public void push(int data) {
        //Create the New Node and update the Head of LinkedList
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //Insert Node at end of LinedList
    public void append(int data) {
        //Create a new Node
        Node node = new Node(data);

        //In order to get the last node, we need to traverse the List
        /* if List is empty */
        if (head == null) {
            head = node;
            return;
        }
        // In order to traverse the list, we start from head and loop till last
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        //Update the last node
        temp.next = node;
        return;
    }
    // Insert at any index
    public void addAt(int data, int index) {
        Node node = new Node(data);

        if (index == 0 || head == null) {
            node.next = head;
            head = node;
            return;
        }
        //else reach to the index
        Node temp = head;
        int count = 0;
        boolean indexFound = false;
        while (temp != null) {
            
            if (count == index) {
                indexFound = true;
                break;
            }
            count++;
            temp = temp.next;
        }
        if (!indexFound) {
            System.out.println("IndexOutOfBound Exception");
            return;
        }
        //Finally update previous and next node
        node.next = temp.next;
        temp.next = node;
        return;
    }

    //Print the List
    public void print() {
        Node temp = head;
        System.out.println("----------");
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("+++++++++++");
    }

    //Count the List
    public int length() {
        int len = 0;
        Node temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        LinkedListInsertion ll = new LinkedListInsertion();
        ll.print();
        //Add some Node
        ll.append(2);
        ll.append(3);
        ll.print();
        ll.addAt(12,2);
        ll.print();
        ll.addAt(12,5);
        ll.print();
        ll.addAt(10,0);
        ll.print();
        ll.push(11);
        ll.print();
    }
}