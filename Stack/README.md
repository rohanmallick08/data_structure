# Stack
Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).

Example
```
1.  Balancing of symbols
2.  Infix to Postfix /Prefix conversion
3.  Redo-undo features at many places like editors, photoshop.
4.  Forward and backward feature in web browsers
5.  Used in many algorithms like Tower of Hanoi, tree traversals, stock span       problem, histogram problem.
6.  Other applications can be Backtracking, Knight tour problem, rat in a maze,    N queen problem and sudoku solver
7.  In Graph Algorithms like Topological Sorting and Strongly Connected            Components
```

## Basic Operations in Stack
```
    1. Push: Adds an item in the stack. If the stack is full, then it is said     to be an overflow condition.
    2. Pop: Removes an item from the stack. The items are popped in the           reversed order in which they are pushed. If the stack is empty, then it    is said to be an Underflow condition.
    3. Peek or Top: Returns top element of stack.
    4. isEmpty: Returns true if stack is empty, else false.
```
## Implementation
```
    1. Using array
    2. Using linked list
```

### Using Array
```
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
```

```
    Pros: Easy to implement. Memory is saved as pointers are not involved.
    Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at        runtime.
```

### Using LinkedList

