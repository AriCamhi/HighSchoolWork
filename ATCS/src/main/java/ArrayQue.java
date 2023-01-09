@SuppressWarnings("unchecked")
public class ArrayQue<E> implements Que{

    private int size;
    private E[] que;

    public ArrayQue() {
        que = (E[]) new Object[10];
        size = 0;
    }

    public void doubleSize(){
        E [] x = (E[]) new Object[que.length * 2];
        for(int i = 0; i < que.length; i ++){
            x[i] = que[i];
        }
        que = x;
    }

    @Override
    public boolean push(Object ex) {
        if(size == que.length){
            doubleSize();
        }
        que[size] = (E) ex;
        size++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object peek() {
        return que[0];
    }

    @Override
    public Object poll() {
        Object obj = que[0];
        Object[] arr = new Object[size];
        for(int i = 0; i < size - 1; i++){
            arr[i] = que[i + 1];
        }
        que = (E[]) arr;
        que[size - 1] = null;
        size--;
        return obj;
    }
}
