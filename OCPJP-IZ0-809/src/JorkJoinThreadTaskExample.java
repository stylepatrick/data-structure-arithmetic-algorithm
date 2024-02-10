import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class JorkJoinThreadTaskExample extends RecursiveTask<Double> {

    private int start;
    private Double[] values;

    public JorkJoinThreadTaskExample(Double[] values, int start) {
        this.values = values;
        this.start = start;
    }

    @Override
    protected Double compute() {
        if (start == 0) {
            System.out.println(Arrays.toString(values));
            return Arrays.stream(values).mapToDouble(x -> x).sum();
        } else {
            values[start-1] = new Random().nextDouble(100);
            int minus = start - 1;
            RecursiveTask<Double> d = new JorkJoinThreadTaskExample(values, minus);
            d.fork();
            return d.join();
        }
    }

    public static void main(String[] args) {


        Double[] values = new Double[20];

        ForkJoinTask<Double> task = new JorkJoinThreadTaskExample(values, values.length);
        ForkJoinPool pool = new ForkJoinPool(20);
        Double d = pool.invoke(task);
        System.out.println(d);

        System.out.println("Number of active threads from the given thread: " + Thread.activeCount());

    }
}
