import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class SinglyLinkedList<E> {
    private ListNode<E> head;
    protected int nodeCount;

    public SinglyLinkedList() {
        head = null;
        nodeCount = 0;
    }

    public ListNode<E> getHead() {
        return head;
    }

    public void setHead(ListNode<E> head) {
        this.head = head;
    }

    public int getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", nodeCount=" + nodeCount +
                '}';
    }

    public int size() {
        return nodeCount;
    }

    public void addCount() {
        nodeCount++;
    }

    public void decreaseCount() {
        nodeCount--;
    }

    public void addFirst(E value) {
        head = new ListNode<>(value, head);
        addCount();
    }

    public void addEnd(E value) {
        if (head == null) {
            addFirst(value);
        } else {
            ListNode<E> temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(new ListNode<>(value, null));
            nodeCount++;
        }
    }

    public void add(int index, E value) {
        if (index < 0 || index > nodeCount)
            throw new IndexOutOfBoundsException();
        else if (index == 0)
            addFirst(value);
        else {
            ListNode<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(new ListNode<>(value, temp.getNext()));
            nodeCount++;
        }
    }

    public E removeFront() {
        if (nodeCount == 0)
            throw new NoSuchElementException();
        E output = head.getValue();
        head = head.getNext();
        nodeCount--;
        return output;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(0, 5);
        sll.add(1, 3);
    }
}
