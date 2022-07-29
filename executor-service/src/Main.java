import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        // Callables for the Executor
        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(3000);
            return "Task's execution 1";
        };

        Callable<String> callableTask_2 = () -> {
            TimeUnit.MILLISECONDS.sleep(5000);
            return "Task's execution 2";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask_2);

        // Generate new ThreadPool of 10 Threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<String>> futures;
        try {
            // Start all Actions (callables) from the List
            futures = executorService.invokeAll(callableTasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<String> stringList = new ArrayList<>();
        futures.forEach(future -> {
            try {
                // Calling the get() method while the task is still running will cause execution to block until the task properly executes and the result is available.
                stringList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        // In general, the ExecutorService will not be automatically destroyed when there is no task to process. It will stay alive and wait for new work to do.
        executorService.shutdown();

        stringList.forEach(System.out::println);
    }
}