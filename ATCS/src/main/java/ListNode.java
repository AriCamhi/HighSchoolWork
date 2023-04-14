public class ListNode<E> {
    private E value;
    private ListNode<E> next;

    public ListNode(E value) {
        this.value = value;
        next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public String toString() {
        return value.toString();
    }

    public ListNode(E value, ListNode<E> next) {
        this.value = value;
        this.next = next;
    }
}
