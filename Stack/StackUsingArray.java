class StackUsingArray {

    //Define Max Limit
    static final int MAX = 1000;
    //Track the top of stack
    int top;

    //Define Array
    int a[] = new int[MAX];
    StackUsingArray() {
        top = -1;
    }

    //Push in Stack
    public boolean push(int data) {
        if (top >= MAX -1) {
            System.out.println("Stack OverFlow");
            return false;
        }
        a[++top] = data;
        System.out.println(data + "pushed into Stack");
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty!!");
            return 0;
        }
        int x = a[top--];   //Return the top and decrement.
        return x;
    }

    public int peak() {
        if (top < 0) {
            System.out.println("Stack is empty!!");
            return 0; 
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.pop();
        stack.push(12);
        stack.push(13);
        System.out.println(stack.peak());
    }
}