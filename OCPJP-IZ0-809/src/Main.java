import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        float value1 = 102;
//        float value2 = (int) 102.0;
//        //float value3 = 1f * 0.0;
//        float value4 = 1f * (short) 0.0;
//        //float value5 = 1f * (boolean) 0;
//
//        double d1 = value1;
//        float f1 = (float) d1;
//
//        Test t = Test.TEST;
//        System.out.println(t.getT());
//        t.setT();
//        System.out.println(t.getT());
//
//        List<Integer> list1 = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6));
//        List<Integer> list2 = Collections.synchronizedList(Arrays.asList(1,2,3,4,5,6));
//        for (Integer item : list1) list1.add(5);
//        for (Integer item : list2) list2.remove(0);
//
//        System.out.println(list1.size() + " " + list2.size());
//
//        InnerClass i = new InnerClass();
//        InnerClass.Inner h = i.new Inner();
//
//        StaticInnerClass c = new StaticInnerClass();
//        //StaticInnerClass.Inner hh = c.new Inner();
//        StaticInnerClass.Inner fda = new StaticInnerClass.Inner();
//
//        class Abc {
//            private int x = 5;
//            public int b = 5;
//        }
//
//        Abc a = new Abc();
//        System.out.println(a.x);
//
//        Abstract abst = new Abstract() {
//            private int x = 5;
//
//            public int getX() {
//                return x;
//            }
//        };
//
//        System.out.println(abst.x);
//
//        ArrayDeque<String> l = new ArrayDeque<>();
//
//        List<String> fdsa = new ArrayList();
//        List ddf = new ArrayList<String>();
//        List list = new ArrayList();
//        Object ldd = list.get(0);
//        test(list);
//
//        List<String> stringList = new ArrayList();
//        test(stringList);
//
//        List<String> g = list;
//        List<Integer> d = list;
//
//        List dd = stringList;
//
//        List<?> fdas = new ArrayList();
//        List<?> fdasd = new ArrayList<String>();
//        List<String> fdddd = (ArrayList<String>) fdasd;
//        test(fdasd);
//        testt(fdasd);
//        testt(fdas);
//        test(fdddd);
//        test(fdasd);
//
//        Comparator cdd = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        };
//
//        Collections.sort(list, cdd);
//
//        List<String> stringList1 = new ArrayList<>();
//        stringList1.forEach(stringList1 -> System.out.println(stringList1));

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(15);
        q.remove(99);
        System.out.println(q);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30)
                .plusMonths(-1).plusYears(20);
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());

    }


    public static void test(List<String> ist){
        return;
    }

    public static void test2(List<?> ist){
        return;
    }

    String abc = "abc";
    Predicate<String> s = abc::startsWith;
    BiPredicate<String, String> ddd = String::startsWith;

    Supplier<Queue<String>> queueSupplier = LinkedList::new;
    Consumer<String> stringConsumer = System.out::println;
    BiConsumer<List<Integer>, Integer> integerConsumer = List::add;
    Function<String, Integer> stringIntegerFunction = String::length;
    BiFunction<String, Integer, Integer> stringIntegerIntegerBiFunction = Main::testBiFunction;

    BinaryOperator<String> stringStringUnaryOperator = String::concat;

    public static Integer testBiFunction(String i, Integer a) {
        return i.length() + a;
    }

}