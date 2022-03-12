public class MyQueue {

    int[] queue;
    int tail;
    int head;
    int size;

    MyQueue(int size) {
        this.queue = new int[size];
        this.size = size;
        this.tail = 0;
        this.head = 0;
    }

    public void enqueue(int i) {
        // % used to rotate in array -> array doesn't need to get rebuild if size (queue.length) is reached
        if (this.head != (tail + 1) % size) {
            queue[tail] = i;
            this.tail = (tail + 1) % size;
        } else {
            System.out.println("Queue full");
        }
    }

    public int dequeue() {
        if (head == tail) {
            System.out.println("Queue empty");
            return -1;
        } else {
            int x = queue[head];
            head = (head + 1) % size;
            return x;
        }
    }



}
