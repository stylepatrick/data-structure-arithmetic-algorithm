public class Philosoph extends Thread {
    
    int id;
    int thinkTime;
    int eatTime;
    Fork fork;
    
    Philosoph(int i, int t1, int t2, Fork a) {
        id = i;
        thinkTime = t1;
        eatTime = t2;
        fork = a;
    }

    @Override
    public void run() {
        for (;;) {
            try {
                sleep(thinkTime);
                fork.eatStart(id);
                System.out.println("Philosoph " + id + " is eating...");
                sleep(eatTime);
                fork.eatEnd(id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
