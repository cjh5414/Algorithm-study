package BinarySearchTree;

class BinarySearchTree {
    Node root = null;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
    }
}
