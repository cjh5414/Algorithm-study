package BinarySearchTree;

class BinarySearchTree {
    Node root = null;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;

        else {
            Node temp = root;
            while (true) {
                if (value < temp.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    public void inOrderTraversalPrint() {
        inOrderTraversalPrint(root);
    }

    public void inOrderTraversalPrint(Node node) {
        if (node == null) return;
        inOrderTraversalPrint(node.left);
        System.out.println(node.value);
        inOrderTraversalPrint(node.right);
    }
}
