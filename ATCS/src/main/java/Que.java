public interface Que<E> {
    boolean push(E ex);

    boolean isEmpty();

    E peek();

    E poll();
}
