public class Queue {

    int[] queue;
    int head;
    int tail;
    int length;

    Queue(int size) {
        queue = new int[size];
        head = 0;
        tail = 0;
        length = 0;
    }

    synchronized void put(int i) {
        try {
            while (length >= queue.length) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        length++;
        queue[tail] = i;
        tail = (tail + 1) % queue.length;
        notifyAll();
    }

    synchronized int get() {
        try {
            while (length <= 0) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        length--;
        int q = queue[head];
        head = (head + 1) % queue.length;
        notifyAll();
        return q;
    }
}
