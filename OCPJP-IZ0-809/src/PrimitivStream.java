import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitivStream {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);
        //OptionalDouble optionalInt = intStream.filter((a) -> a % 2 == 0).average();
        //System.out.println(optionalInt.orElseGet(() -> Double.NaN));
        IntSummaryStatistics doubleSummaryStatistics = intStream.summaryStatistics();
        System.out.println(doubleSummaryStatistics);
        //Stream<Integer> integerStream = intStream.mapToObj(Integer::valueOf);
        //integerStream.forEach(System.out::println);
        //DoubleStream doubleStream = intStream.mapToDouble(Double::valueOf);
        //System.out.println(doubleStream.max().orElseGet(() -> Double.parseDouble("3")));
        IntStream s = Stream.of(1, 2, 3).mapToInt(x -> x);
        Stream<Integer> sd = IntStream.range(1,5).mapToObj(Integer::valueOf);
        DoubleStream doubleStream = s.mapToDouble(x -> x);
        LongStream longStream = doubleStream.mapToLong(x -> (long) x);
        IntStream intStream2 = longStream.mapToInt(x -> (int) x);
        //IntStream intStream3 = doubleStream.mapToInt(x -> (int) x);
        //Stream<Double> doubleStream1 = longStream.mapToDouble(x -> x).mapToObj(x -> x);

        IntStream intStream1 = IntStream.rangeClosed(1, 5);
        long d = intStream1.count();
        long ff = intStream1.count();

    }
}
