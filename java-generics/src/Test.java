import java.util.ArrayList;
import java.util.List;

public class Test<E> {

    List<E> list;
    public Test() {
        list = new ArrayList<>();
    }

    public void addAll(List<? extends E> e) {
        e.forEach(x -> {
            list.add(x);
        });
    }

    public void getAll(List<? super E> e) {
        list.forEach(x -> e.add(x));
    }
}
