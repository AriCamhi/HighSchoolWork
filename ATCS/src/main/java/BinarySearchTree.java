public class BinarySearchTree<E> extends BinaryTree {

    public BinarySearchTree() {
        super();
    }

    @Override
    public void insert(Comparable item) {
        if (getRoot() == null) {
            setRoot(new TreeNode(item));
        } else {
            TreeNode temp = getRoot();
            while (temp.hasLeft() || temp.hasRight()) {
                if (item.compareTo(temp.getValue()) < 0) {
                    if (!temp.hasLeft()) {
                        temp.setLeft(new TreeNode(item));
                    }
                    temp = temp.getRight();
                } else {
                    if (!temp.hasRight()) {
                        temp.setRight(new TreeNode(item));
                    }
                    temp = temp.getRight();
                }
            }
        }
    }

    @Override
    public TreeNode find(Comparable key) {
        if (getRoot() == null) {
            return null;
        } else {
            TreeNode temp = getRoot();
            if (key.compareTo(temp.getValue()) == 0) {
                return temp;
            }
            while (temp.hasLeft() || temp.hasRight()) {
                if (key.compareTo(temp.getValue()) == 0) {
                    return temp;
                }
                if (key.compareTo(temp.getValue()) < 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return null;
    }

    @Override
    public TreeNode remove(Comparable node) {
        if (getRoot() == null) {
            return null;
        }
        TreeNode temp = getRoot();
        if (temp.getValue().equals(node)) {
            return removeRoot();
        }
        TreeNode parent = temp;
        while (temp.hasLeft() || temp.hasRight()) {
            int comp = node.compareTo(temp.getValue());
            if (comp == 0) {
                break;
            } else if (comp < 0) {
                parent = temp;
                temp = temp.getLeft();
            }
            else {
                parent = temp;
                temp = temp.getRight();
            }
        }
        // At leaf node, or exact match
        TreeNode removing = temp;
        if (temp.hasRight()) {
            while (temp.hasRight()) {
                temp = temp.getRight();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return traversePostorder(getRoot(), "");
    }

    public TreeNode findMax(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root;
        while (temp.hasRight()) {
            temp = temp.getRight();
        }
        return temp;
    }

    public TreeNode findMin(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root;
        while (temp.hasLeft()) {
            temp = temp.getLeft();
        }
        return temp;
    }

    public TreeNode removeRoot() {
        if (getRoot() == null) {
            return null;
        }
        TreeNode temp = getRoot();
        if (!temp.hasRight()) {
            setRoot(temp.getLeft());
            return temp;
        }
        temp = temp.getRight();
        if (!temp.hasLeft()) {
            temp.setLeft(getRoot().getLeft());
            temp = getRoot();
            setRoot(temp.getRight());
            return temp;
        }
        while (temp.hasLeft() && temp.getLeft().hasLeft()) {
            temp = temp.getLeft();
        }
        TreeNode temp2 = temp.getLeft();
        temp.setLeft(temp2.getRight());
        temp = getRoot();
        setRoot(temp2);
        getRoot().setLeft(temp.getLeft());
        getRoot().setRight(temp.getRight());
        return temp;
    }
}
