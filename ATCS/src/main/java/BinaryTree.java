public abstract class BinaryTree<E> {
    private TreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode<E> root) {
        setRoot(root);
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> t) {
        root = t;
    }

    public abstract void insert(Comparable<E> item);

    public abstract TreeNode<E> find(Comparable<E> key);

    public abstract TreeNode<E> remove(Comparable<E> node);

    public abstract String toString();

    private void traversePreorder(TreeNode root) {
        if (root != null) {
            process(root.getValue());
            traversePreorder(root.getLeft());
            traversePreorder(root.getRight());
        }
    }

    private void traverseInorder(TreeNode root) {
        if (root != null) {
            traverseInorder(root.getLeft());
            process(root.getValue());
            traverseInorder(root.getRight());
        }
    }

    private void traversePostorder(TreeNode root) {
        if (root != null) {
            traversePostorder(root.getLeft());
            traversePostorder(root.getRight());
            process(root.getValue());
        }
    }

    protected String traversePostorder(TreeNode root, String str) {
        if (root != null) {
            traversePostorder(root.getLeft());
            traversePostorder(root.getRight());
            return str + root.getValue();
        }
        return null;
    }

    private void process(Object value) {
        System.out.println(value);
    }

}

