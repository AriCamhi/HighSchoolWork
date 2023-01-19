public interface Stax<E> {

    boolean isEmpty();

    E push(E x);

    E pop();

    E peek();
}
