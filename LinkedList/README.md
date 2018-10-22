# Linked List
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.

It consist of Node and each node have data and a link to the next node.

# Why Linked List?
Arrays can be used to store linear data of similar types, but arrays have following limitations.
```
1) The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage.
```
```
2) Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and to create room existing elements have to shifted.
```

## Advantages over arrays
```
1) Dynamic size
2) Ease of insertion/deletion
```
## Drawbacks
```
1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do **binary search** with linked lists efficiently with its default implementation.
2) Extra memory space for a pointer is required with each element of the list.
3) Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.
```
## Insertion in Linked List:

A Node can be added in three ways in the LinkedList.

```
1. In front of Lined List
2. After a given Node / at particular index on LinedList
3. At the end of the LinkedList
```
While updating at front, update the head of Node.
```
    //Insert Node at the beginning
    public void push(int data) {
        //Create the New Node and update the Head of LinkedList
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
```
While updating at given node, first traverse upto the index, then update it.
```
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
            count++;
            if (count == index) {
                indexFound = true;
                break;
            }
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
```
While updating to the last Node, traverse upto last node anc check for null of next node.
```
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
        while (**temp.next** != null) {
            temp = temp.next;
        }
        //Update the last node
        temp.next = node;
        return;
    }
```
## Deletion of Node at specific index.

Track the previous and current Node while traversing and update the previous node with the current node next data.
```
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
```

## Delete the LinkedList itself

In C/C++, we need to free/delete all the node one by one.
In JAVA, we just need to make the head pointer to null and rest will take care by Garbage collector of JAVA.
```
    //Delete LinkedList
    public void deleteList() {
        //Just make head as null in JAVA as it has garbage collector
        //In C/C++, manully free all node and make head as null.
        head = null;
    }
```
## Length of Lined List

### Iterative Way
```
     public int length () {
        Node temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
```

### Recursive Way
```
    public int lengthRec(Node node) {

        if (node == null) {
            return 0;
        }

        return 1 + lengthRec(node.next);
    }

    public int len() {
        return lengthRec(head);
    }
```
## find at nth index in LinedList
```
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
```

# Circular LinkedList

In circular LinedList, all the node are connected in order to form a circle. There is no null  next of any node.

Circlular LinedList can be asingly circular linked list or doubly circular linked list.

![alt text](https://github.com/rohanmallick08/myFiles/blob/master/CircularLinkeList.png)

## Advantages:-
```
1. Any node can be the first node or startting point unlike head pointer of singly linkedlist.  We can traverse the whole list by starting from any point. We just need to stop when the first visited node is visited again.

2. Useful for implementation of queue. we don’t need to maintain two pointers for front and rear if we use circular linked list.

3. Circular Doubly Linked Lists are used for implementation of advanced data structures like Fibonacci Heap.
```

# Doubly LinkedList
A Doubly Linked List (DLL) contains an extra pointer, typically called previous pointer, together with next pointer and data which are there in singly linked list.
![alt text](https://github.com/rohanmallick08/myFiles/blob/master/DLL1.png)

## Add Node in Beginning.
```
     public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
```

## Add Node at index
```
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
```

## Append Node in last
```
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
```

## Print List
```
    public void print() {
        Node current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        } 
    }
```

