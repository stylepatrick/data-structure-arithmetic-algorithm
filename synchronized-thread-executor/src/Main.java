import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        // Waiting for a Pool of Threads to Complete
        List<String> stringList = Collections.synchronizedList(new ArrayList<>());
        CountDownLatch countDownLatch = new CountDownLatch(5);
        List<Thread> workers = Stream
                .generate(() -> new Thread(new Worker(stringList, countDownLatch)))
                .limit(5)
                .toList();

        workers.forEach(Thread::start);
        try {
            // await() will block until the worker threads are finished
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stringList.add("Latch released");

        stringList.forEach(System.out::println);

    }
}