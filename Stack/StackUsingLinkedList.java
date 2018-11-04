import java.util.*;
class StackUsingLinkedList {

    static class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    //define the head pointer
    Node head;

    // In Stack, we maintain the head node so that it always pointing the last 
    //pushed object into the stack

    //As this Stack will be using LinedList, there should not be any fixed size.
    public void push(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
        return;
    }

    public boolean empty() {
        return head == null;
    }
    public int pop() {
        if (empty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        
        //Get the data, remove node and return 
        Node temp = head;
        head = temp.next;
        return temp.data;

    }
    public int peak() {
        if (empty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return head.data;
    }

    public void print() {

        if (empty()) {
            System.out.println("Stack is empty");
        }

        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + "\n");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        try {
            StackUsingLinkedList stack = new StackUsingLinkedList();
           // stack.pop();
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.print();
            System.out.println(stack.peak());
            System.out.println(stack.pop());
            stack.print();
        } catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }



}