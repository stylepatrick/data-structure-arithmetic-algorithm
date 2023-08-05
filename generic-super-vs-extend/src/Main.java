import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        List<D> dList = new ArrayList<>();

        // aList not possible for <? extends B>
        // producer(aList);
        producer(dList);
        producer(bList);
        producer(cList);

        consumer(aList);
        consumer(bList);
        consumer(cList);
        // D not possible for <? super C>
        //consumer(dList);

    }

    private static void producer(List<? extends B> elements) {
        // Producer can use A or B
        for (B b:  elements) {
            b.doB();
            b.doA();
        }
        // Not possible to add new elements
        // elements.add(new A());
        // elements.add(new B());
    }

    private static void consumer(List<? super C> elements) {
        // Consumer can only use Object
        for (Object c : elements) {
            System.out.println(c);
        }
        elements.add(new C());
        elements.add(new D());
        // Not possible to add elements higher than C
        // elements.add(new B());
    }
}
