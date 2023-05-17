public class TreeNode<E> {
    private E value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(E initValue) {
        value = initValue;
        left = null;
        right = null;
    }

    public TreeNode(TreeNode initLeft, E initValue, TreeNode initRight) {
        value = initValue;
        left = initLeft;
        right = initRight;
    }

    public E getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setValue(E theNewValue) {
        value = theNewValue;
    }

    public void setLeft(TreeNode theNewLeft) {
        left = theNewLeft;
    }

    public void setRight(TreeNode theNewRight) {
        right = theNewRight;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public String toString() {
        return value.toString();
    }
}
