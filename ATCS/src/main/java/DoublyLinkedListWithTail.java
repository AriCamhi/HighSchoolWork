import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class DoublyLinkedListWithTail<E> extends SinglyLinkedListWithTail<E> {
    public DoublyLinkedListWithTail() {
    }


    public void addFirstDoubly(E value) {
        if (size() == 0) {
            DoubleListNode<E> node = new DoubleListNode<E>(null, value, null);
            setHead(node);
            setTail(node);
            addCount();
        } else {
            DoubleListNode<E> node = new DoubleListNode<E>(null, value, (DoubleListNode<E>) getHead());
            ((DoubleListNode<E>) getHead()).setPrev(node);
            setHead(node);
            addCount();
        }
    }

    public void addLast(E value) {
        if (getHead() == null) {
            addFirst(value);
        } else {
            DoubleListNode<E> node = new DoubleListNode<E>((DoubleListNode<E>) getTail(), value, null);
            ((DoubleListNode<E>) getTail()).setNext(node);
            addCount();
            setTail(node);
        }
    }

    public void addDoubly(int index, E value) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirstDoubly(value);
        } else if (index == size()) {
            addLast(value);
        } else {
            DoubleListNode<E> temp = (DoubleListNode<E>) getHead();
            for (int count = 0; count < index; count++) {
                temp = temp.getNext();
            }
            DoubleListNode<E> node = new DoubleListNode<E>(temp.getPrev(), value, temp);
            temp.getPrev().setNext(node);
            temp.setPrev(node);
            addCount();
        }
    }

    public E removeFirst() {
        if (getHead() == null)
            throw new NoSuchElementException();
        DoubleListNode<E> head = (DoubleListNode<E>) getHead();
        setHead(head.getNext());
        head.getNext().setPrev(null);
        decreaseCount();
        return head.getValue();
    }

    public E removeLast() {
        if (getHead() == null)
            throw new NoSuchElementException();
        if (getHead().equals(getTail())) {
            DoubleListNode<E> temp = (DoubleListNode<E>) getTail();
            setHead(null);
            setTail(null);
            return temp.getValue();
        }
        DoubleListNode<E> tail = (DoubleListNode<E>) getTail();
        setTail(tail.getPrev());
        tail.getPrev().setNext(null);
        decreaseCount();
        return tail.getValue();
    }

    public E remove(int index) {
        if (index < 0 || index >= size())
            throw new NoSuchElementException();
        else if (index == 0)
            return removeFirst();
        else if (index == size() - 1)
            return removeLast();
        DoubleListNode<E> temp = (DoubleListNode<E>) getHead();
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());
        decreaseCount();
        return temp.getValue();
    }

    public boolean removeDoubly(E value) {
        int index = findIndex(value);
        if (index == 1)
            return false;
        else {
            remove(index);
            return true;
        }
    }

    public void sortDoublyLinkedList(DoublyLinkedListWithTail<E> list) {

    }

    public void swap(DoubleListNode<E> node){

    }

}
