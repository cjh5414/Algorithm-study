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

    public boolean retreive(int val) {
        Node tmp = root;

        while (tmp != null && val != tmp.value) {
            if (val < tmp.value) tmp = tmp.left;
            else tmp = tmp.right;
        }

        if (tmp == null) return false;
        else return true;
    }

    public boolean delete(int val) {
        Node parent = root;
        Node tmpParent;
        Node tmp = root;

        while (tmp != null && val != tmp.value) {
            parent = tmp;
            if (val < tmp.value) tmp = tmp.left;
            else tmp = tmp.right;
        }

        if (tmp == null) return false;

        else if (tmp.left == null && tmp.right == null) {
            if (val < parent.value) parent.left = null;
            else parent.right = null;
        }
        else {
            tmpParent = parent;
            if (tmp.right != null) {


            }
            else
        }

        return true;
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
