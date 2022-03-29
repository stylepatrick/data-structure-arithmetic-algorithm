public class SortedList<T extends Comparable<T>> {

    Node<T> head;
    int length;

    void push(Node<T> type) {
        Node<T> h = head;
        Node<T> prev = null;
        if (h == null) {
            head = type;
        } else {
            while (h != null && type.compareTo((T) h) > 0) {
                prev = h;
                h = h.next;
            }
            if (h == head) {
                head = type;
            } else {
                prev.next = type;
            }
            type.next = h;
        }
        length++;
    }

    T get(int i) {
        Node<T> h = head;
        Node<T> prev = null;
        if (h != null) {
            int j = 1;
            while (h != null) {
                if (j == i) {
                    if (h == head) {
                        head = head.next;
                    } else {
                        prev.next = h.next;
                    }
                    length--;
                    return (T) h;
                } else {
                    j++;
                    prev = h;
                    h = h.next;
                }
            }
        }
        return null;
    }

    int size() {
        return length;
    }

}
