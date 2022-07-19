import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<MyElement> myElements = new ArrayList<>();
        myElements.add(new MyElement(5, "five", 1.5, 1, new MySubElement("subFive")));
        myElements.add(new MyElement(1, "one", 1.1, 1, new MySubElement("subOne")));
        myElements.add(new MyElement(4, "four", 1.4, 2, new MySubElement("subFour")));
        myElements.add(new MyElement(3, "three", 1.3, 2, new MySubElement("subThree")));
        myElements.add(new MyElement(2, "two", 1.2, 3, new MySubElement("subTwo")));

        // Print every s attribute sorted by s
        myElements.stream()
                .map(MyElement::getS)
                .sorted(String::compareTo)
                .forEach(System.out::println);

        // Create sum of all d attributes
        Double d = myElements.stream()
                .map(MyElement::getD)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(d);

        // Print all subElements sorted by i
        myElements.stream()
                .sorted(Comparator.comparing(MyElement::getI))
                .map(MyElement::getMySubElement)
                .forEach(mySubElement -> System.out.println(mySubElement.getSubstring()));

        // Print all elements with i > 2
        myElements.stream()
                .map(MyElement::getI)
                .filter(i -> i > 2)
                .sorted(Integer::compareTo)
                .forEach(integer -> System.out.println(integer + "I"));

        // count elements where i > 2
        long i = myElements.stream()
                .filter(element -> element.getI() > 2)
                .count();

        // check if an s attribute exists which starts with c
        boolean b = myElements.stream()
                .anyMatch(element -> element.getS().startsWith("c"));
        System.out.println(b);

        // find first element where s starts with o
        MyElement findFirst = myElements.stream()
                .filter(element -> element.getS().startsWith("o"))
                .findFirst()
                .orElse(null);
        System.out.println(findFirst);

        // distinct by key Object.equals methode used
        myElements.stream()
                .sorted(Comparator.comparing(MyElement::getI))
                .distinct()
                .forEach(System.out::println);

        // create map of elements by key and sorted values
        Map<Integer, List<MyElement>> myElementMap = myElements.stream()
                .sorted(Comparator.comparing(MyElement::getI))
                .collect(Collectors.groupingBy(MyElement::getKey));
        for (Map.Entry<Integer, List<MyElement>> entry : myElementMap.entrySet()) {
            System.out.println(entry);
        }

        // concat s and substring from sub element and join it with ,
        Stream<String> allS = myElements.stream()
                .sorted(Comparator.comparing(MyElement::getI))
                .map(MyElement::getS);

        Stream<String> allSub = myElements.stream()
                .sorted(Comparator.comparing(MyElement::getI))
                .map(element -> element.getMySubElement().getSubstring());

        String s = Stream.concat(allS, allSub).collect(Collectors.joining(","));
        System.out.println(s);

        Stream<MyElement> myElementStream = myElements.stream();

        // build map with key of i
        Map<Integer, MyElement> map = myElements.stream()
                .collect(Collectors.toMap(MyElement::getI, e -> e));
        for (Map.Entry<Integer, MyElement> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}