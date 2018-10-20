class NthNodeInLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void push (int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int find(int index) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        System.out.println("Couldn't fount index");
        return 0;
    }
    public static void main(String[] args) {
        NthNodeInLinkedList list = new NthNodeInLinkedList();
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(15);
        System.out.println(list.find(2));
        System.out.println(list.find(0));
        System.out.println(list.find(1));
        System.out.println(list.find(4));
    }
}