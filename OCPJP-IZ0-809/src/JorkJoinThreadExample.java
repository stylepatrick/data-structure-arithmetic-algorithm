import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.stream.DoubleStream;

public class JorkJoinThreadExample extends RecursiveAction {

    public static int i = 0;
    private int start;
    private Double[] values;

    public JorkJoinThreadExample(Double[] values, int start) {
        this.values = values;
        this.start = start;

        System.out.println(i++);
    }

    @Override
    protected void compute() {
        if (start == 0) {
            System.out.println(Arrays.toString(values));
        } else {
            values[start-1] = new Random().nextDouble(100);
            int minus = start - 1;
            RecursiveAction d = new JorkJoinThreadExample(values, minus);
            d.fork();
        }
    }

    public static void main(String[] args) {

        Double[] values = new Double[1000];

        ForkJoinTask<?> task = new JorkJoinThreadExample(values, values.length);
        ForkJoinPool pool = new ForkJoinPool(12);
        pool.invoke(task);

        System.out.println("Number of active threads from the given thread: " + Thread.activeCount());




    }
}
