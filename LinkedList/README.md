# Linked List
### A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.

### It consist of Node and each node have data and a link to the next node.

# Why Linked List?
### Arrays can be used to store linear data of similar types, but arrays have following limitations.
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