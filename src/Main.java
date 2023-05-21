public class Main {
    public static void main(String[] args) {
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
    }
}