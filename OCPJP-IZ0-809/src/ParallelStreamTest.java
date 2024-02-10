import java.util.stream.IntStream;

public class ParallelStreamTest {

    public static void main(String[] args) {
        IntStream stream = IntStream.iterate(0, (a) -> a + 1);
        stream.parallel().limit(100).sorted().forEach(System.out::println);
    }

}
