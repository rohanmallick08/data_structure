class DeleteNodeFromLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        } 
    }
    //Define head pointer
    Node head;
    //add simple push in front; for complete Insertion, check LinkedListInsertion.java
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void print() {
        Node temp = head;
        System.out.println("----------------");
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("+++++++++++++++++");
    }

    //Delete Node at Index
    public void delete(int index) {
        if (head == null || index == 0) {
            head = head.next;
            return;
        }
        int count = 0;
        Node currNode = head;
        Node prevNode = head;
        boolean indexFound = false;
        while(currNode != null) {
            if(count == index) {
                prevNode.next = currNode.next;
                indexFound = true;
                return;
            }
            count++;
            prevNode = currNode;
            currNode = currNode.next;
        }
        if (!indexFound) {
            System.out.println("Node at specified index not found.");
        }

    }
    public static void main(String[] args) {
        DeleteNodeFromLinkedList list = new DeleteNodeFromLinkedList();
        list.push(2);
        list.push(3);
        list.push(4);
        list.print();
        list.delete(1);
        list.print();
        list.delete(1);
        list.print();
        list.delete(2);
    }
}