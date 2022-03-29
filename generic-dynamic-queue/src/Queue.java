public class Queue<T> {

    Node<T> head;
    Node<T> tail;

    void push(Node<T> type) {
        Node<T> h = head;
        if (h == null) {
            head = type;
        } else {
            tail.next = type;
        }
        tail = type;
    }

    Node<T> get() {
        Node<T> h = head;
        if (h != null) {
            head = h.next;
            return h;
        }
        return null;
    }

}
