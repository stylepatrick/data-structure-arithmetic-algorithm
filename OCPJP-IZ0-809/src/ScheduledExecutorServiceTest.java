import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = null;

        try {
            executorService = Executors.newSingleThreadScheduledExecutor();
            Runnable runnable = ScheduledExecutorServiceTest::test;
            executorService.scheduleWithFixedDelay(runnable, 10, 10, TimeUnit.SECONDS);
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }
    }

    private static void test() {
        LocalTime time = LocalTime.now();
        System.out.println("test" + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}
