package BinarySearchTree;

public class Tester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(3);
        bst.insert(20);
        bst.insert(13);
        bst.insert(2);
        bst.insert(16);
        bst.insert(11);
        bst.insert(9);

        bst.inOrderTraversalPrint();

    }
}