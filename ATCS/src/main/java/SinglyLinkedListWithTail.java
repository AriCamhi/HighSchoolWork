import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class SinglyLinkedListWithTail<E> extends SinglyLinkedList {

    private ListNode<E> tail;

    public SinglyLinkedListWithTail() {
        tail = null;
    }

    public SinglyLinkedListWithTail(E[] values) {
        for (E value : values) {
            addEnd(value);
        }
    }

    public ListNode<E> getTail() {
        return tail;
    }

    public void setTail(ListNode<E> tail) {
        this.tail = tail;
    }

    public void addFirstTail(E value) {
        super.addFirst(value);
        if (getHead().getNext() == null) {
            tail = getHead();
        }
    }

    public void addLast(E value) {
        if (getHead() == null) {
            addFirst(value);
        } else {
            tail.setNext(new ListNode<>(value));
            tail = tail.getNext();
            nodeCount++;
        }
    }

    public void add(E value, int index) {
        super.add(index, value);
        if (index == size() - 1) {
            tail = tail.getNext();
        } else if (size() == 1) {
            tail = getHead();
        }
    }

    public E removeFirst() {
        if (size() == 1)
            setTail(null);
        return (E) super.removeFront();
    }

    public E removeLast() {
        if (tail == null)
            throw new NoSuchElementException();
        ListNode<E> temp = getHead();
        while (temp.hasNext() && temp.getNext().hasNext()) {
            temp = temp.getNext();
        }
        tail = temp;
        temp = temp.getNext();
        tail.setNext(null);
        nodeCount--;
        return (E) temp.getValue();
    }

    public E remove(int index) {
        if (index == size() - 1)
            return removeLast();
        else
            return (E) super.remove(index);
    }

    @Override
    public Object remove(Object value) {
        if (findIndex((E) value) == -1)
            return false;
        if (findIndex((E) value) == size() - 1) {
            removeLast();
            return true;
        } else {
            remove(findIndex((E) value));
            return true;
        }
    }

    public int findIndex(E value) {
        ListNode<E> temp = getHead();
        int counter = 0;
        while (temp.hasNext()) {
            if (value.equals(temp.getValue())) {
                return counter;
            }
            counter++;
            temp = temp.getNext();
        }
        return -1;
    }
}
