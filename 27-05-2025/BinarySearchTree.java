
// Binary Search Tree Implementation
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    static class Node {
        int value;
        Node right, left;

        public Node(int item) {
            value = item;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value > root.value) {
            root.left = insertRec(root.left, value);
        } else if (value < root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    private void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    private int minValue(Node root) {
        int minval = root.value;
        while (root.left != null) {
            root = root.left;
            minval = root.value;
        }
        return minval;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void levelOrderTraversal(Node node) {
        if (node == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }

    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(30);
        tree.insert(70);
        tree.insert(90);
        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(80);
        System.out.println("In-order traversal(should be sorted):");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("\nPreorder traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postOrderTraversal(tree.root);

        System.out.println("\nLevel order traversal:");
        tree.levelOrderTraversal(tree.root);

        System.out.println("Delete 20");
        tree.delete(20);
        System.out.println("In-order traversal after deleting 20");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // Delete a node with one child
        System.out.println("Delete 30");
        tree.delete(30);
        System.out.println("In-order traversal after deleting 30");
        tree.inOrderTraversal(tree.root);
        System.out.println();
    }
}