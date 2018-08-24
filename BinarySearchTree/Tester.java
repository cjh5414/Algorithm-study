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
        bst.insert(30);
        bst.insert(25);
        bst.insert(23);
        bst.insert(32);

        bst.inOrderTraversalPrint();

        System.out.println("Find 13 : " + bst.retreive(13));
        System.out.println("Find 7 : " + bst.retreive(7));
        System.out.println("Find 9 : " + bst.retreive(9));

        System.out.println("Del 20 : " + bst.delete(20));
        bst.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 11 : " + bst.delete(11));
        bst.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 9 : " + bst.delete(9));
        bst.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 9 : " + bst.delete(9));
        bst.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 3 : " + bst.delete(3));
        bst.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 2 : " + bst.delete(2));
        bst.inOrderTraversalPrint();
        System.out.println("");


        System.out.println("Recursive BinarySearchTree");
        BinarySearchTree bst2 = new BinarySearchTree();

        bst2.insertRcs(3);
        bst2.insertRcs(20);
        bst2.insertRcs(13);
        bst2.insertRcs(2);
        bst2.insertRcs(16);
        bst2.insertRcs(11);
        bst2.insertRcs(9);
        bst2.insertRcs(30);
        bst2.insertRcs(25);
        bst2.insertRcs(23);
        bst2.insertRcs(32);

        bst2.inOrderTraversalPrint();

        System.out.println("Find 13 : " + bst2.retreive(13));
        System.out.println("Find 7 : " + bst2.retreive(7));
        System.out.println("Find 9 : " + bst2.retreive(9));

        System.out.println("Del 20 : " + bst2.delete(20));
        bst2.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 11 : " + bst2.delete(11));
        bst2.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 9 : " + bst2.delete(9));
        bst2.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 9 : " + bst2.delete(9));
        bst2.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 3 : " + bst2.delete(3));
        bst2.inOrderTraversalPrint();
        System.out.println("");

        System.out.println("Del 2 : " + bst2.delete(2));
        bst2.inOrderTraversalPrint();
        System.out.println("");
    }
}