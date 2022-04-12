package util.queue;

/**
 * Generic Node used to wrap next element
 * @author stylepatrick
 */
public class Node<T> {

    /**
     * Value of type T
     */
    public T value;

    Node<T> next;

    /**
     * Generate new Node Object
     * @param value value of type T
     * */
    public Node(T value) {
        this.value = value;
    }
}
