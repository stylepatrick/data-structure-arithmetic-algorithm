import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(() -> 4);
        boolean streamA = stream.allMatch(x -> x >= 5);

        //boolean stramB = stream.allMatch(x -> x == 5);

        Predicate<String> pred = a -> a.startsWith("onetwotwotwo");
        Stream<String> stringStream = Stream.iterate("-", (a) -> a + "d");
        TreeSet<String> test = stringStream.map(s -> s + "55").limit(5).sorted().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(test);

        List<Integer> a = Arrays.asList(1,2);
        List<Integer> b = Arrays.asList(1,2);
        List<Integer> c = Arrays.asList(1,2);

    }
}
