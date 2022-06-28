import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer integer = 12;
        Double d = 1.0;
        String str = "Test";

        List rohtype = new ArrayList<>();
        rohtype.add(integer);
        rohtype.add(d);
        rohtype.add(str);

        Object i = rohtype.get(0);

        List<Integer> list = new ArrayList<>();

        Integer c = list.get(0);


        System.out.println("Hello world!");

        Number n = 12;
        Integer da = 5;
        Double a = 1.0;
        List<Integer> dd = new ArrayList<>();
        list.add(n);

        List<TestSuper> aa = new ArrayList<>();
        aa.add(new TestSuper());

        List<TestSuper> testSupers = new ArrayList<>();
        testSupers.add(new TestSuper());

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);

        Test<Number> test = new Test<>();
        test.addAll(doubles);

        List<Integer> integers = new ArrayList<>();

        Integer itz = 1;
        Number dann = itz;
    }

}