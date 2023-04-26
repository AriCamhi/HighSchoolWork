public class DoubleListNode<E> extends ListNode<E> {
    private ListNode<E> prev;

    public DoubleListNode(E value) {
        super(value);
        prev = null;
    }

    public DoubleListNode(DoubleListNode<E> prev, E value, DoubleListNode<E> next) {
        super(value, next);
        this.prev = prev;
    }

    public DoubleListNode<E> getNext() {
        return (DoubleListNode<E>) (super.getNext());
    }

    public void setNext(DoubleListNode<E> next) {
        super.setNext(next);
    }

    public DoubleListNode<E> getPrev() {
        return (DoubleListNode<E>) prev;
    }

    public void setPrev(DoubleListNode<E> prev) {
        this.prev = prev;
    }

    public boolean hasPrev() {
        return prev != null;
    }
}
