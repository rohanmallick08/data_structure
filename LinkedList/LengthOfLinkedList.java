class LengthOfLinkedList {

    static class Node {

        int data;
        Node next;
        Node (int data) {
            data = data;
            next = null;
        }
    }

    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int length () {

        Node temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int lengthRec(Node node) {

        if (node == null) {
            return 0;
        }

        return 1 + lengthRec(node.next);
    }

    public int len() {
        return lengthRec(head);
    }

    public static void main(String[] args) {
        LengthOfLinkedList list = new LengthOfLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.length());
        System.out.println(list.len());
    }
}