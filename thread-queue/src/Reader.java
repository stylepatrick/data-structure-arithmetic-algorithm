public class Reader extends Thread {

    Queue queue;

    Reader(Queue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println(queue.get());
        }
    }
}
