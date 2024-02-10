import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceTest {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        System.out.println("begin");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable runnable = () -> System.out.println("runnable");
        Callable<String> stringCallable = () -> {
            System.out.println("callable!");
            return "return";
        };

        Future<?> future = executorService.submit(runnable);
        List<Runnable> notExecuted = executorService.shutdownNow();
        //Future<String> stringFuture = executorService.submit(stringCallable);

        System.out.println(future.get());
       // System.out.println(stringFuture.get());
        System.out.println(notExecuted);

        executorService.shutdown();
        System.out.println("finish");
    }


}
