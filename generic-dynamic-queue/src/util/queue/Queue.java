package util.queue;

/**
 * Generic Queue of type T
 * @author stylepatrick
 */
public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    /**
     * Push element to Queue
     * @param type push Object of type T to Queue
     */
    public void push(Node<T> type) {
        Node<T> h = head;
        if (h == null) {
            head = type;
        } else {
            tail.next = type;
        }
        tail = type;
    }

    /**
     * Get element from Queue
     * @return element from Queue of type T
     */
    public Node<T> get() {
        Node<T> h = head;
        if (h != null) {
            head = h.next;
            return h;
        }
        return null;
    }

}
