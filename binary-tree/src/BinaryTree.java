public class BinaryTree {

    Node root;


    public void add(int value) {
        root = insert(root, value);
    }
    private Node insert(Node current, int val) {
        if (current == null) {
            return new Node(val);
        }

        if (val < current.val) {
            current.left = insert(current.left, val);
        } else if (val > current.val) {
            current.right = insert(current.right, val);
        } else {
            return current;
        }
        return current;
    }
}
