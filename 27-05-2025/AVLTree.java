public class AVLTree {
    static class Node {
        int key, height;
        Node left, right;

        public Node(int d) {
            key = d;
            height = 1;
        }
    }

    private Node root;

    int height(Node N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    int getBalance(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    Node rightRotate(Node Y) {
        Node X = Y.left;
        Node Z = X.right;
        X.right = Y;
        Y.left = Z;
        Y.height = Math.max(height(Y.left), height(Y.right)) + 1;
        X.height = Math.max(height(X.left), height(X.right)) + 1;
        return X;
    }

    Node leftRotate(Node X) {
        Node Y = X.right;
        Node Z = Y.left;
        Y.left = X;
        X.right = Z;
        X.height = Math.max(height(X.left), height(X.right)) + 1;
        Y.height = Math.max(height(Y.left), height(Y.right)) + 1;
        return Y;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }
        node.height = Math.max(height(node.left), height(node.left));
        int balance = getBalance(node);
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        return node;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.key + " ");
            inOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    public static void main(String args[]) {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
        System.out.println("InOrder Traversal of constructing AVL Tree is: ");
        tree.inOrderTraversal();
    }
}