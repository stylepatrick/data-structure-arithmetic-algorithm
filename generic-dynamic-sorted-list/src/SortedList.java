public class SortedList<T extends Node<T>> {

    Node<T> head;
    int length;

    void push(T type) {
        Node<T> p = type;
        Node<T> h = head;
        Node<T> prev = null;
        if (h == null) {
            head = p;
        } else {
            while (h != null && p.compareTo((T) h) > 0) {
                prev = h;
                h = h.next;
            }
            if (h == head) {
                head = p;
            } else {
                prev.next = p;
            }
            p.next = h;
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

    void print() {
        Node<T> h = head;
        if (h != null) {
            while (h != null) {
                h.print();
                h = h.next;
            }
        }
    }

    int size() {
        return length;
    }

}
