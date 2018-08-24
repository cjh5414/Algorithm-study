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

    public void insertRcs(int value) {
        if (root == null)
            root = new Node(value);
        else
            insertRcs(root, value);
    }

    public void insertRcs(Node node, int value) {
        if (value < node.value) {
            if (node.left == null)
                node.left = new Node(value);
            else
                insertRcs(node.left, value);
        }
        else {
            if (node.right == null)
                node.right = new Node(value);
            else
                insertRcs(node.right, value);
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
        else if (tmp.left == null && tmp.right != null) {
            if (val < parent.value) parent.left = tmp.right;
            else parent.right = tmp.right;
        }
        else if (tmp.left != null && tmp.right == null) {
            if (val < parent.value) parent.left = tmp.left;
            else parent.right = tmp.left;
        }
        else {
            int min = deleteMinNode(tmp.right);
            tmp.value = min;
        }

        return true;
    }

    public int deleteMinNode(Node root) {
        Node parent = root;
        Node minNode = root;

        while (minNode.left != null) {
            parent = minNode;
            minNode = minNode.left;
        }

        if (minNode.right == null)
            parent.left = minNode.right;
        else
            parent.left = null;

        return minNode.value;
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
