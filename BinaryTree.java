package Lesson3;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value)
            return true;

        if (value < current.value)
            return containsNodeRecursive(current.left, value);

        if (value > current.value)
            return containsNodeRecursive(current.right, value);

        return false;
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null)
            return null;
        if (value == current.value) {
            if (current.left == null && current.right == null) return null;
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            int smallValue = findSmallValue(current);
            current.value = smallValue;
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
            return current;
        }
        return current;
    }

    private int findSmallValue(Node current) {
        return current.left == null ? current.value : findSmallValue(current.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
}
