# [![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=BinarySearchTree(BST))](https://git.io/typing-svg)
* The Binary Search Tree (BST) is a data structure that provides efficient insertion, deletion, and search operations. It maintains a binary tree structure where each node has a key-value pair, and the keys are ordered such that the left subtree of a node contains keys smaller than the node's key, and the right subtree contains keys greater than the node's key.
### Methods
`put(K key, V value)`
Inserts a key-value pair into the BST. If the key already exists, the value is updated.

`key`: The key of the element to be inserted.
`value`: The value associated with the key.
`get(K key)`
Retrieves the value associated with the given key from the BST.

`key`: The key to search for.
Returns the value associated with the key, or null if the key is not found in the BST.

`delete(K key)`
Deletes a node with the given key from the BST.

`key`: The key of the node to be deleted.
`containsValue(V value)`
Checks if the BST contains a node with the specified value.

`value`: The value to search for.
Returns `true` if a node with the value is found in the BST, or `false` otherwise.

`size()`
Returns the number of nodes in the BST.

Returns an integer representing the size of the BST.

`iterator()`
Returns an iterator to perform an in-order traversal of the BST. The iterator iterates over the keys in ascending order.

Returns an `Iterator` object that can be used to iterate over the keys of the BST.

### Usage

``` java
BST<Integer, String> bst = new BST<>();
bst.put(1, "one apple");
bst.put(2, "two apples");
bst.put(3, "three apples");

System.out.println("BST size: " + bst.size());

// Print all key-value pairs using iterator
System.out.println("Iterating over the BST:");
for (Integer key : bst) {
    System.out.println("Key: " + key + ", Value: " + bst.get(key));
}

// Check if the tree contains a specific value
String valueToFind = "Two";
System.out.println("BST contains value '" + valueToFind + "': " + bst.containsValue(valueToFind));

// Delete a key-value pair
int keyToDelete = 2;
bst.delete(keyToDelete);
System.out.println("Deleted key " + keyToDelete);

// Print all key-value pairs again to verify deletion
System.out.println("Iterating over the updated BST:");
for (Integer key : bst) {
    System.out.println("Key: " + key + ", Value: " + bst.get(key));
}
```
Output:
``` java
BST size: 3
Iterating over the BST:
Key: 1, Value: one apple
Key: 2, Value: two apples
Key: 3, Value: three apples
BST contains value 'Two': true
Deleted key 2
Iterating over the updated BST:
Key: 1, Value: one apple
Key: 3, Value: three apples
```
