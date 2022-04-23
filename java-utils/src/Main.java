import java.util.*;

public class Main {
    public static void main(String[] args) {

        String text = "This is the text for the list";

        // List contains all elements. Not sorted. LinkedList could be used too.
        List<String> list = textToArrayList(text, new ArrayList<>());

        for (String i : list) {
            System.out.println(i);
        }

        // Element is unique, list is sorted with TreeSet.
        // HashSet could be used too not sorted and not unique.
        TreeSet<String> treeSet = textToTreeSet(text, new TreeSet<>());

        for (String i : treeSet) {
            System.out.println(i);
        }

        // Elements are unique in TreeMap and sorted.
        // HashMap could be used too not sorted and not unique.
        TreeMap<String, Integer> treeMap = countWords(text);

        for (Map.Entry<String, Integer> i : treeMap.entrySet()) {
            System.out.println(i);
        }

        // HashMap with ArrayList Datastructures
        HashMap<String, ArrayList<Double>> timeMapOfUsers = new HashMap<>();
        timeMapOfUsers.put("Patrick", new ArrayList<>());
        timeMapOfUsers.put("Gaby", new ArrayList<>());

        setTimes(timeMapOfUsers);

        if (timeMapOfUsers.containsKey("Patrick")) {
            System.out.println(timeMapOfUsers.get("Patrick"));
        }

    }

    private static List<String> textToArrayList(String text , List<String> list) {
        if (!text.contains(" ")) {
            list.add(text);
            return list;
        } else {
            list.add(text.substring(0, text.indexOf(" ")).trim());
            text = text.substring(text.indexOf(" ") + 1);;
            return textToArrayList(text, list);
        }
    }

    private static TreeSet<String> textToTreeSet(String text , TreeSet<String> list) {
        if (!text.contains(" ")) {
            list.add(text);
            return list;
        } else {
            list.add(text.substring(0, text.indexOf(" ")).trim());
            text = text.substring(text.indexOf(" ") + 1);
            return textToTreeSet(text, list);
        }
    }

    private static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        while (text.contains(" ")) {
            String word = text.substring(0, text.indexOf(" ")).trim();
            text = text.substring(text.indexOf(" ") + 1);
            if (treeMap.containsKey(word)) {
                treeMap.put(word, treeMap.get(word) + 1);
            } else {
                treeMap.put(word, 1);
            }
        }
        return treeMap;
    }

    private static void setTimes(HashMap<String, ArrayList<Double>> map) {
        for (Map.Entry<String, ArrayList<Double>> entry : map.entrySet()) {
            ArrayList<Double> times = entry.getValue();
            times.add(Math.random());
        }
    }
}