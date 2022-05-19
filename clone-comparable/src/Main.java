import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(new Node(1));
        stack.push(new Node(2));

        // Clone of Stack
        Stack clone = stack.clone();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Car c = new Car("VW", "Golf", 111);
        Car d = new Car("VW", "Golf", 111);
        Car a = new Car("VW", "Golf", 100);
        Car b = new Car("BMW", "Car", 200);

        // TreeSet uses compareTo, sorted order by compareTo
        // Equal values from compareTo are not added to TreeSet
        TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(c);
        carTreeSet.add(a);
        carTreeSet.add(b);
        carTreeSet.add(d);

        System.out.println(carTreeSet);

        Comparator<Car> comparator = Comparator.comparingInt(o -> o.size);
        List<Car> sortedBySize = new ArrayList<>(carTreeSet.stream().toList());
        sortedBySize.sort(comparator);

        System.out.println(sortedBySize);

        // HashSet use hashCode, not sorted only unique
        // if equals true hashCode is the same
        HashSet<Car> carHashSet = new HashSet<>();
        carHashSet.add(b);
        carHashSet.add(d);
        carHashSet.add(c);
        carHashSet.add(a);


        System.out.println(carHashSet);


    }
}