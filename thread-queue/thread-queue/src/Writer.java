public class Writer extends Thread {

    Queue queue;

    Writer(Queue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        int i = 0;
        for(;;) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.put(i++);
        }
    }
}
