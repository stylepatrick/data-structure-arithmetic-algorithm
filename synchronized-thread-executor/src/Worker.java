import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    private List<String> stringList;
    private CountDownLatch countDownLatch;

    public Worker(List<String> stringList, CountDownLatch countDownLatch) {
        this.stringList = stringList;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        stringList.add("Counted down");
        countDownLatch.countDown();
    }
}