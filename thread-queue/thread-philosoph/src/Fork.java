public class Fork {

    boolean[] fork;

    Fork() {
        this.fork = new boolean[5];
    }

    synchronized void eatStart(int id) {
        int left = id;
        int right = (id+1) % 5;

        try {
            while (fork[left] || fork[right]) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fork[left] = true;
        fork[right] = true;
    }

    synchronized void eatEnd(int id) {
        int left = id;
        int right = (id+1) % 5;
        fork[left] = false;
        fork[right] = false;
        notifyAll();
    }
}
