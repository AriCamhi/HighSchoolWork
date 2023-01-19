@SuppressWarnings("unchecked")
public class ArrayStax<E> implements Stax<E> {
    private Object[] stk;
    private int size;

    public ArrayStax() {
        stk = new Object[10];
        size = 0;
    }

    public void doubleSize() {
        Object[] x = new Object[stk.length * 2];
        for (int i = 0; i < stk.length; i++) {
            x[i] = stk[i];
        }
        stk = x;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public E push(E x) {
        if (size == stk.length) {
            doubleSize();
        }
        stk[size] = x;
        size++;
        return x;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            E x = (E) stk[size - 1];
            stk[size - 1] = null;
            size--;
            return x;
        }
        return null;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) stk[size - 1];
    }
}
