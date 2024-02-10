import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileTest {

    private static void m() throws IOException {
        try {
            throw new FileNotFoundException();
        } catch (IOException e) {
            e = new FileNotFoundException(); //Line 10
            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        File dir = new File("F:" + System.getProperty("file.separator") + "A");
        dir.mkdir();
        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> c = map::put;
        BiFunction<String, String, String> f = map::put;
        String d = f.apply("a", "b");
        c.accept("a", "b");
        BinaryOperator<String> b = map::put;
        System.out.println("");
        //m();


        Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x -> x);
        //DoubleStream ds = s.mapToDouble(x -> x);
        //Stream<Integer> s2 = ds.mapToInt(x -> x);
        //s2.forEach(System.out::print);

        Path path1 = Paths.get("/lemur/habitat/./party.txt");
        Path path2 = path1.subpath(1,4).toAbsolutePath();
        System.out.println(path2);

        LocalDate date = LocalDate.of (2100, 5, 14);
        LocalTime time = LocalTime.of(9, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration daa = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(dateTime.plus(daa));
    }
}
