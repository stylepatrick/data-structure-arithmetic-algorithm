public class Queue<T> {

    T[] queue;
    int head;
    int tail;
    int size;

    Queue(int size) {
        this.queue = (T[]) new Object[size];
        this.head = 0;
        this.tail = 0;
        this.size = size;
    }

    void push(T value) {
        if (head != (tail + 1) % size) {
         queue[tail] = value;
         tail = (tail + 1) % size;
        }
    }

    T get() {
        if (head != tail) {
            int pos = head;
            head = (head + 1) % size;
            return queue[pos];
        }
        return null;
    }

}
